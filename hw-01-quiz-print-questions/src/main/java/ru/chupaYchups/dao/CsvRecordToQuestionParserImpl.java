package ru.chupaYchups.dao;

import org.apache.commons.csv.CSVRecord;
import ru.chupaYchups.model.Question;

public class CsvRecordToQuestionParserImpl implements CsvRecordToQuestionParser {

    public static final String RIGHT_ANSWER_MARKER = "*";

    @Override
    public Question parse(CSVRecord csvRecord) {
        Question.QuestionBuilder questionBuilder = Question.builder();
        questionBuilder.questionText(csvRecord.get(0));
        for (int i = 1; i < csvRecord.size(); i++) {
            String variantText = csvRecord.get(i);
            if (variantText.startsWith(RIGHT_ANSWER_MARKER)) {
                questionBuilder.rightAnswerNum(0);
                variantText = variantText.substring(1);
            }
            questionBuilder.answerVariant(variantText);
        }
        return questionBuilder.build();
    }
}
