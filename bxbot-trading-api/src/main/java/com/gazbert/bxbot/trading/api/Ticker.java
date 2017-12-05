package com.gazbert.bxbot.trading.api;

import java.math.BigDecimal;

public interface Ticker {

    BigDecimal getLastPrice();

    public void setLastPrice(BigDecimal lastPrice);

    public BigDecimal getLow();

    public void setLow(BigDecimal low);

    public BigDecimal getHigh();

    public void setHigh(BigDecimal high);

    public BigDecimal getVolume();

    public void setVolume(BigDecimal volume);
}
