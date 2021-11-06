package hello.itemservice.web.validation.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created by sskim on 2021/11/06
 * Github : http://github.com/sskim91
 */
@Data
public class ItemUpdateForm {

    @NotNull
    private Long id;

    @NotNull
    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 1_000, max = 1_000_000)
    private Integer price;

    //수정에서는 수량을 자유롭게 변경할 수 있다.
    private Integer quantity;

}
