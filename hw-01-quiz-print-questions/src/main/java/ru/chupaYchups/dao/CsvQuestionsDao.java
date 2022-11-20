package ru.chupaYchups.dao;

import lombok.Data;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.ClassPathResource;
import ru.chupaYchups.model.Question;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
public class CsvQuestionsDao implements QuestionsDao {

    private final String csvFileName;
    private final CsvRecordToQuestionParser csvRecordToQuestionParser;

    @Override
    public List<Question> getQuestions() {
        List<Question> questionList = new ArrayList<>();
        try {
            ClassPathResource classPathResource = new ClassPathResource(csvFileName);
            for (CSVRecord record : CSVFormat.DEFAULT.parse(new FileReader(classPathResource.getFile()))) {
                Question question = csvRecordToQuestionParser.parse(record);
                questionList.add(question);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error while parse csv file of questions");
        }
        return questionList;
    }
}
