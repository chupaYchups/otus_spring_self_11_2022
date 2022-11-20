package ru.chupaYchups.model;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class Question {
    private final String questionText;
    private final int rightAnswerNum;
    @Singular("answerVariant")
    private final List<String> answerVariantList;
}
