package ru.chupaYchups.service;

import lombok.Data;
import ru.chupaYchups.dao.QuestionsDao;

@Data
public class QuizServiceImpl implements QuizService{

    private final QuestionsDao questionsDao;
    private final OutputService outputService;

    public static final String QUESTION_MARK = "?";

    @Override
    public void printQuestions() {
        questionsDao.getQuestions().forEach(question -> {
            outputService.outputLine(question.getQuestionText() + QUESTION_MARK);
        });
    }
}
