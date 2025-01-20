package ru.job4j.site.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DAO модель сущности Feedback сервиса MOCK
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 25.10.2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDTO {
    private int id;
    private int interviewId;
    private int userId;
    private int roleInInterview;
    private String textFeedback;
    private int scope;
}