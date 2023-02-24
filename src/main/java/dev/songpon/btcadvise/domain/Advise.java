package dev.songpon.btcadvise.domain;

import java.time.LocalDateTime;

public class Advise {
    private String baseCoin;
    private String guide;
    private LocalDateTime time;
    private float exchangeRate;

    public Advise(String baseCoin, String guide, LocalDateTime time, float exchangeRate) {
        this.baseCoin = baseCoin;
        this.guide = guide;
        this.time = time;
        this.exchangeRate = exchangeRate;
    }

    public String getBaseCoin() {
        return baseCoin;
    }

    public void setBaseCoin(String baseCoin) {
        this.baseCoin = baseCoin;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
