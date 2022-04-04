package com.epam.mentoring.poll.dao.impl;

import com.epam.mentoring.poll.dao.ResultDao;
import com.epam.mentoring.poll.domain.Result;

import java.util.List;

public class ResultDaoImpl implements ResultDao {

    public ResultDao resultDao;

    @Override
    public List<Result> findAll() {
        return resultDao.findAll();
    }

    @Override
    public Result findById(long id) {
        return resultDao.findById(id);
    }

    @Override
    public List<Result> findByPollId(long pollId) {
        return resultDao.findByPollId(pollId);
    }

    @Override
    public Result findByScore(long pollId, int score) {
        return resultDao.findByScore(pollId, score);
    }
}

