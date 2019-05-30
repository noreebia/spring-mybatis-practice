package org.sooyoung.mybatispractice.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse {
    private int code;
    private String message;
    private Object details;
}
