package hello.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by sskim on 2021/11/21
 * Github : http://github.com/sskim91
 */
@Data
@AllArgsConstructor
public class ErrorResult {

    private String code;
    private String message;
}
