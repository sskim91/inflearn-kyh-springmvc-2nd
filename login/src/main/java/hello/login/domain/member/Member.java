package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Created by sskim on 2021/11/07
 * Github : http://github.com/sskim91
 */
@Data
public class Member {

    private Long id;

    @NotEmpty
    private String loginId; //로그인 ID
    @NotEmpty
    private String name;    //사용자 이름
    @NotEmpty
    private String password;
}
