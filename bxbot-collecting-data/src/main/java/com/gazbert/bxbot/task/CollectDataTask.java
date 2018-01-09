package com.gazbert.bxbot.task;

import com.gazbert.bxbot.domain.trading.Ticker;
import com.gazbert.bxbot.exchanges.BitstampExchangeAdapter;
import com.gazbert.bxbot.services.HistoryDataService;
import com.gazbert.bxbot.trading.api.ExchangeNetworkException;
import com.gazbert.bxbot.trading.api.TradingApiException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.URISyntaxException;

@Component
public class CollectDataTask {

    @Resource
    private HistoryDataService historyDataService;

    @Resource
    private BitstampExchangeAdapter bitstampExchangeAdapter;

    @Scheduled(fixedRate = 1000*60)
    public void saveMarketHistory() throws URISyntaxException, TradingApiException, ExchangeNetworkException {
        Ticker ticker = bitstampExchangeAdapter.getTicker("btcusd");
        historyDataService.save(bitstampExchangeAdapter.getImplName(),ticker);
    }
}
