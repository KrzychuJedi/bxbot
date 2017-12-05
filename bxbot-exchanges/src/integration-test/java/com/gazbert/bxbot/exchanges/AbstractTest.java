package com.gazbert.bxbot.exchanges;

import com.gazbert.bxbot.exchange.api.ExchangeAdapter;
import com.gazbert.bxbot.exchange.api.ExchangeConfig;
import com.gazbert.bxbot.trading.api.MarketOrderBook;
import com.gazbert.bxbot.trading.api.Ticker;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class AbstractTest {

    static final String MARKET_ID = "btcusd";

    ExchangeConfig exchangeConfig;

    @Test
    public void testTickerCall() throws Exception {

        PowerMock.replayAll();
        final ExchangeAdapter exchangeAdapter = new BitfinexExchangeAdapter();
        exchangeAdapter.init(exchangeConfig);

        Ticker ticker = exchangeAdapter.getTicker(MARKET_ID);
        assertNotNull(ticker);
        assertNotNull(ticker.getHigh());
        assertNotNull(ticker.getLastPrice());
        assertNotNull(ticker.getLow());
        assertNotNull(ticker.getVolume());

        PowerMock.verifyAll();
    }
}
