package dev.songpon.btcadvise.api.v1.response;

public class AdviseResponse {
    private String baseCoin;
    private String guide;
    private float exchangeRate;

    public AdviseResponse(String baseCoin, String guide, float exchangeRate) {
        this.baseCoin = baseCoin;
        this.guide = guide;
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

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
