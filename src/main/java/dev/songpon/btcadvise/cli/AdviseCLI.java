package dev.songpon.btcadvise.cli;

import dev.songpon.btcadvise.repository.CoinExchangeRateAPIRepository;
import dev.songpon.btcadvise.service.AdviserService;
import dev.songpon.btcadvise.service.AdviserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdviseCLI {

//    public static void main (String[] args) {
//        var adviseService = new AdviserServiceImpl(new CoinExchangeRateAPIRepository());
//        var advise = adviseService.getAdvise(args[0]);
//        System.out.println("Base Coin: " + advise.getBaseCoin());
//        System.out.println("Exchange Rate: " + advise.getExchangeRate());
//        System.out.println("Guide: " + advise.getGuide());
//    }
}
