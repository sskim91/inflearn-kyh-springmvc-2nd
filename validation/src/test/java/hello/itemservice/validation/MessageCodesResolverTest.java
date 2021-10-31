package hello.itemservice.validation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.ObjectError;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by sskim on 2021/10/31
 * Github : http://github.com/sskim91
 */
public class MessageCodesResolverTest {

    MessageCodesResolver codesResolver = new DefaultMessageCodesResolver();

    @Test
    void messageCodesResolverObject() throws Exception {
        String[] messageCodes = codesResolver.resolveMessageCodes("required", "item");
        System.out.println("messageCodes = " + Arrays.toString(messageCodes));

        //디테일한게 먼저, 그 다음에 범용성
        //new ObjectError("item", new String[]{"required.item", "required"});

        assertThat(messageCodes).containsExactly("required.item", "required");
    }

    @Test
    void messageCodesResolverField() throws Exception{
        String[] messageCodes = codesResolver.resolveMessageCodes("required", "item", "itemName", String.class);
        System.out.println("messageCodes = " + Arrays.toString(messageCodes));

        //bindingResult.rejectValue("itemName", "required");
        assertThat(messageCodes).containsExactly(
                "required.item.itemName",
                "required.itemName",
                "required.java.lang.String",
                "required");
    }
}
