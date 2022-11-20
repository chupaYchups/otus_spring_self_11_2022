package ru.chupaYchups.dao;

import org.apache.commons.csv.CSVRecord;
import ru.chupaYchups.model.Question;

public interface CsvRecordToQuestionParser {

    Question parse(CSVRecord csvRecord);
}
