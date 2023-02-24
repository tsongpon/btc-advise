package dev.songpon.btcadvise.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dev.songpon.btcadvise.domain.Advise;
import dev.songpon.btcadvise.repository.transport.ExchangeRateTransport;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Repository
@Profile("mock")
public class CoinExchangeRateFileRepository implements CoinExchangeRateRepository {

    @Override
    public Advise getCoinExchangeRate(String baseCoin) {

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try {
            var file = new File(this.getClass().getClassLoader().getResource("exchange_rate/btc.json").getFile());
            var transport = mapper.readValue(file, ExchangeRateTransport.class);
            return new Advise(transport.getAssetIdBase(), null, transport.getTime(), transport.getRate());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
