package dev.songpon.btcadvise.repository;

import dev.songpon.btcadvise.domain.Advise;
import dev.songpon.btcadvise.repository.transport.ExchangeRateTransport;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
@Profile("!mock")
public class CoinExchangeRateAPIRepository implements CoinExchangeRateRepository {
    // TODO: Should get API key from env
    private String apiKey = "C78053AE-B7DB-47AF-89C7-3FD1ADB8435C";

    @Override
    public Advise getCoinExchangeRate(String baseCoin) {
        var url = String.format("https://rest.coinapi.io/v1/exchangerate/%s/USD?apikey=%s", baseCoin, this.apiKey);
        var webClient = WebClient.create(url);
        var transport = webClient.get().retrieve().bodyToMono(ExchangeRateTransport.class).block();
        return new Advise(transport.getAssetIdBase(), null, transport.getTime(), transport.getRate());
    }
}
