package dev.songpon.btcadvise.repository.transport;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDateTime;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ExchangeRateTransport  {
    private LocalDateTime time;
    private String assetIdBase;
    private String assetIdQuote;
    private float rate;

    public ExchangeRateTransport(LocalDateTime time, String assetIdBase, String assetIdQuote, float rate) {
        this.time = time;
        this.assetIdBase = assetIdBase;
        this.assetIdQuote = assetIdQuote;
        this.rate = rate;
    }

    public ExchangeRateTransport() {
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getAssetIdBase() {
        return assetIdBase;
    }

    public void setAssetIdBase(String assetIdBase) {
        this.assetIdBase = assetIdBase;
    }

    public String getAssetIdQuote() {
        return assetIdQuote;
    }

    public void setAssetIdQuote(String assetIdQuote) {
        this.assetIdQuote = assetIdQuote;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
