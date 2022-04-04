package com.epam.mentoring.poll.dao.impl;

import com.epam.mentoring.poll.dao.Dao;
import com.epam.mentoring.poll.domain.Poll;

import java.util.List;

public class PollDaoImpl implements Dao<Poll> {

    public Dao dao;

    @Override
    public List<Poll> findAll() {
        return dao.findAll();
    }

    @Override
    public Poll findById(long id) {
        return (Poll) dao.findById(id);
    }
}
