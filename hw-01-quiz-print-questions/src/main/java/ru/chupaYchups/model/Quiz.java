package ru.chupaYchups.model;

import lombok.Data;

import java.util.List;

@Data
public class Quiz {
    private final List<Question> questionList;
    private int rightAnswers;
}
