package com.epam.mentoring.poll.dao.impl;

import com.epam.mentoring.poll.dao.AnswerDao;
import com.epam.mentoring.poll.domain.Answer;

import java.util.List;

public class AnswerDaoImpl implements AnswerDao {

    public AnswerDao answerDao;

    @Override
    public List<Answer> findAll() {
        return answerDao.findAll();
    }

    @Override
    public Answer findById(long id) {
        return answerDao.findById(id);
    }

    @Override
    public List<Answer> findByQuestionId(long questionId) {
        return answerDao.findByQuestionId(questionId);
    }
}
