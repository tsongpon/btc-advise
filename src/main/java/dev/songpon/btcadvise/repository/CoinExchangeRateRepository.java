package dev.songpon.btcadvise.repository;

import dev.songpon.btcadvise.domain.Advise;
import dev.songpon.btcadvise.repository.transport.ExchangeRateTransport;

public interface CoinExchangeRateRepository {
    Advise getCoinExchangeRate(String baseCoin);
}
