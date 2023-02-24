package dev.songpon.btcadvise.service;

import dev.songpon.btcadvise.domain.Advise;
import dev.songpon.btcadvise.repository.CoinExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdviserServiceImpl implements AdviserService {

    private CoinExchangeRateRepository coinExchangeRateRepository;

    @Autowired
    public AdviserServiceImpl(CoinExchangeRateRepository coinExchangeRateRepository) {
        this.coinExchangeRateRepository = coinExchangeRateRepository;
    }

    @Override
    public Advise getAdvise(String baseCoin) {
        var advise = coinExchangeRateRepository.getCoinExchangeRate(baseCoin);
        var exchangeRateInt = Math.round(advise.getExchangeRate());
        if (exchangeRateInt % 2 == 0) {
            advise.setGuide("BUY");
        } else {
            advise.setGuide("SELL");
        }
        return advise;
    }
}
