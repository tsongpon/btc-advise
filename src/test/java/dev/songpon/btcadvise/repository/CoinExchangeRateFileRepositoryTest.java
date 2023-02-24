package dev.songpon.btcadvise.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinExchangeRateFileRepositoryTest {

    @Test
    void getCoinExchangeRate() {
        var repo = new CoinExchangeRateFileRepository();
        var advise = repo.getCoinExchangeRate("BTC");
        System.out.println(advise.getExchangeRate());
    }
}