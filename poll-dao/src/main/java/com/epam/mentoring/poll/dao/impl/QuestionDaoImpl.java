package com.epam.mentoring.poll.dao.impl;

import com.epam.mentoring.poll.dao.QuestionDao;
import com.epam.mentoring.poll.domain.Question;

import java.util.List;

public class QuestionDaoImpl implements QuestionDao {

    public QuestionDao questionDao;

    @Override
    public List<Question> findAll() {
        return questionDao.findAll();
    }

    @Override
    public Question findById(long id) {
        return questionDao.findById(id);
    }

    @Override
    public List<Question> findByPollId(long pollId) {
        return questionDao.findByPollId(pollId);
    }
}
