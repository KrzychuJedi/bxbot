package com.gazbert.bxbot.trading.api;

import java.math.BigDecimal;

public interface Ticker {

    BigDecimal getLastPrice();

    void setLastPrice(BigDecimal lastPrice);

    BigDecimal getLow();

    void setLow(BigDecimal low);

    BigDecimal getHigh();

    void setHigh(BigDecimal high);

    BigDecimal getVolume();

    void setVolume(BigDecimal volume);
}
