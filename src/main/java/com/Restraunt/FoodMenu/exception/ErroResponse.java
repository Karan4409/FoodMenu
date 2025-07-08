package com.Restraunt.FoodMenu.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErroResponse {
    private int id;
    private String message;
    private LocalDateTime timestamp;


}
