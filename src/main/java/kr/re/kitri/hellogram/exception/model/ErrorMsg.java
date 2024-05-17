package kr.re.kitri.hellogram.exception.model;

import lombok.Data;

@Data
public class ErrorMsg {
    private String errorCode;
    private String message;
    private String technicalMessage;
}
