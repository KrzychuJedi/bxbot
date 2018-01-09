/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Gareth Jon Lynch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.gazbert.bxbot.exchanges.trading.api.impl;

import com.gazbert.bxbot.domain.trading.TickerImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Tests the Market Order impl behaves as expected.
 * <p>
 * NOTE: The TickerImpl class methods were mostly auto-generated by IntelliJ, but I've included a test for
 * completeness... and my head hurts - I need some easy code to write ;-)
 *
 * @author gazbert
 */
public class TestTickerImpl {

    private static final BigDecimal LAST = new BigDecimal("18789.58");
    private static final BigDecimal BID = new BigDecimal("18778.25");
    private static final BigDecimal ASK = new BigDecimal("18783.33");
    private static final BigDecimal LOW = new BigDecimal("17111.00");
    private static final BigDecimal HIGH = new BigDecimal("18790.76");
    private static final BigDecimal OPEN = new BigDecimal("17477.98");
    private static final BigDecimal VOLUME = new BigDecimal("10231.12911572");
    private static final BigDecimal VWAP = new BigDecimal("17756.56");
    private static final Long TIMESTAMP = 1513439945L;


    @Test
    public void testTickerIsInitialisedAsExpected() {

        final TickerImpl ticker = new TickerImpl(LAST, BID, ASK, LOW, HIGH, OPEN, VOLUME, VWAP, TIMESTAMP);

        assertEquals(LAST, ticker.getLast());
        assertEquals(BID, ticker.getBid());
        assertEquals(ASK, ticker.getAsk());
        assertEquals(LOW, ticker.getLow());
        assertEquals(HIGH, ticker.getHigh());
        assertEquals(OPEN, ticker.getOpen());
        assertEquals(VOLUME, ticker.getVolume());
        assertEquals(VWAP, ticker.getVwap());
        assertEquals(TIMESTAMP, ticker.getTimestamp());
    }

    @Test
    public void testSettersWorkAsExpected() {

        final TickerImpl ticker = new TickerImpl(null, null, null, null, null, null, null, null, null);
        assertEquals(null, ticker.getLast());
        assertEquals(null, ticker.getBid());
        assertEquals(null, ticker.getAsk());
        assertEquals(null, ticker.getLow());
        assertEquals(null, ticker.getHigh());
        assertEquals(null, ticker.getOpen());
        assertEquals(null, ticker.getVolume());
        assertEquals(null, ticker.getVwap());
        assertEquals(null, ticker.getTimestamp());

        ticker.setLast(LAST);
        assertEquals(LAST, ticker.getLast());

        ticker.setBid(BID);
        assertEquals(BID, ticker.getBid());

        ticker.setAsk(ASK);
        assertEquals(ASK, ticker.getAsk());

        ticker.setLow(LOW);
        assertEquals(LOW, ticker.getLow());

        ticker.setHigh(HIGH);
        assertEquals(HIGH, ticker.getHigh());

        ticker.setOpen(OPEN);
        assertEquals(OPEN, ticker.getOpen());

        ticker.setVolume(VOLUME);
        assertEquals(VOLUME, ticker.getVolume());

        ticker.setVwap(VWAP);
        assertEquals(VWAP, ticker.getVwap());

        ticker.setTimestamp(TIMESTAMP);
        assertEquals(TIMESTAMP, ticker.getTimestamp());
    }
}
