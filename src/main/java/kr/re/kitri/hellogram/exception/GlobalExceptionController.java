package kr.re.kitri.hellogram.exception;

import kr.re.kitri.hellogram.exception.model.ErrorMsg;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionController {

    // ArithmaticException 발생 시 처리되는 코드
    @ExceptionHandler(value = ArithmeticException.class)
    public ErrorMsg handleArithmaticException(ArithmeticException e) {
        ErrorMsg errorMsg = new ErrorMsg();
        errorMsg.setErrorCode("001");
        errorMsg.setMessage("0으로 나누었을 때 발생. 다시한번 확인해 주세요.");
        errorMsg.setTechnicalMessage(e.getMessage());

        return errorMsg;
    }

    // SQLException 발생 시 처리되는 코드
    @ExceptionHandler(value= BadSqlGrammarException.class)
    public ErrorMsg handlerBadSqlGrammarException(BadSqlGrammarException e) {
        ErrorMsg errorMsg = new ErrorMsg();
        errorMsg.setErrorCode("002");
        errorMsg.setMessage("문법이 잘 못 되었습니다.");
        errorMsg.setTechnicalMessage(e.getMessage());
        return errorMsg;
    }
}
