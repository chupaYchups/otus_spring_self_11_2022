package ru.chupaYchups.dao;

import ru.chupaYchups.model.Question;

import java.util.List;

public interface QuestionsDao {
    List<Question> getQuestions();
}
