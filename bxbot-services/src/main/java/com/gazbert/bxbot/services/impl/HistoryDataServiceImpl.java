package com.gazbert.bxbot.services.impl;

import com.gazbert.bxbot.domain.trading.Ticker;
import com.gazbert.bxbot.services.HistoryDataService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HistoryDataServiceImpl implements HistoryDataService {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(String source, Ticker ticker) {
        em.persist(ticker);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ticker> load(String source) {
        return null;
    }
}
