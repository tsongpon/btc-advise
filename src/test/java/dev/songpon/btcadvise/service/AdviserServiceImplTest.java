package dev.songpon.btcadvise.service;

import dev.songpon.btcadvise.repository.CoinExchangeRateAPIRepository;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdviserServiceImplTest {

    @Test
    @Ignore
    void getAdvise() {
        var service = new AdviserServiceImpl(new CoinExchangeRateAPIRepository());
        var advise = service.getAdvise("BTC");
        assertEquals("BTC", advise.getBaseCoin());
    }
}