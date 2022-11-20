package ru.chupaYchups.dao;

import lombok.Data;
import ru.chupaYchups.model.Question;

import java.util.List;

@Data
public class QuestionsDaoImpl implements QuestionsDao {

    private final String csvFileName;

    @Override
    public List<Question> getQuestions() {
        return null;
    }
}
