package dev.songpon.btcadvise.repository;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinExchangeRateAPIRepositoryTest {

    @Test
    @Ignore
    void getCoinExchangeRate() {
        var repo = new CoinExchangeRateAPIRepository();
        var advise = repo.getCoinExchangeRate("BTC");
        System.out.println(advise.getExchangeRate());
    }
}