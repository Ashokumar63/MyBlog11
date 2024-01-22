package com.myblog.myblog11.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorDetails {
    private String message;
    private Date date;
    private String uri;

}
