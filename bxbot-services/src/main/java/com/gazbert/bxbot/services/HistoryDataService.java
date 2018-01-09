package com.gazbert.bxbot.services;

import com.gazbert.bxbot.domain.trading.Ticker;

import java.util.List;

public interface HistoryDataService {

    void save(String source, Ticker ticker);

    List<Ticker> load(String source);
}
