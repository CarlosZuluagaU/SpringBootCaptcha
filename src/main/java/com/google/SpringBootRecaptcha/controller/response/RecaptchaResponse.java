package com.google.SpringBootRecaptcha.controller.response;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)
public class RecaptchaResponse {
    Boolean success;
    String challenge_ts;
    String hostname;
    String score;
    String action;
}
