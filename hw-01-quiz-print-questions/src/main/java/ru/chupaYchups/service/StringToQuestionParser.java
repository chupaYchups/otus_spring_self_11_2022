package ru.chupaYchups.service;

import ru.chupaYchups.model.Question;

public interface StringToQuestionParser {

    Question parse(String textLine);
}
