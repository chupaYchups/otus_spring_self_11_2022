package ru.chupaYchups;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.chupaYchups.service.QuizService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/spring-context.xml");
        classPathXmlApplicationContext.getBean(QuizService.class).printQuestions();
    }
}
