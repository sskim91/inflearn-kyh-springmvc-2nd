package hello.login.web.login;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Created by sskim on 2021/11/07
 * Github : http://github.com/sskim91
 */
@Data
public class LoginForm {

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
