package hello.itemservice.validation;

import hello.itemservice.domain.item.Item;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by sskim on 2021/11/06
 * Github : http://github.com/sskim91
 */
public class BeanValidationTest {

    @Test
    void beanValidation() throws Exception{
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Item item = new Item();
        item.setItemName(" ");  //공백
        item.setPrice(0);
        item.setQuantity(10000);

        Set<ConstraintViolation<Object>> violations = validator.validate(item);
        for (ConstraintViolation<Object> violation : violations) {
            System.out.println("violation = " + violation);
            System.out.println("violation = " + violation.getMessage());
        }
    }
}
