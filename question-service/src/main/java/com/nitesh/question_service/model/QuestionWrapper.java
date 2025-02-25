package com.nitesh.question_service.model;

import lombok.Data;
import lombok.NoArgsConstructor;


// we created wrapper class bcz we were getting question from db using id and in out model there rightanswer was also present and we don't want user to see right answer when he
// is fetching for geting question by id
@Data
@NoArgsConstructor
public class QuestionWrapper {
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
