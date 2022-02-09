package nextstep.subway.ui;

import nextstep.subway.exception.AddSectionFailException;
import nextstep.subway.exception.RemoveSectionFailException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler({
            DataIntegrityViolationException.class,
            AddSectionFailException.class,
            RemoveSectionFailException.class
    })
    public ResponseEntity<Void> handleIllegalArgsException(Exception e) {
        return ResponseEntity.badRequest().build();
    }
}