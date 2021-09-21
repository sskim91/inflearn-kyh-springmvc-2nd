package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sskim on 2021/09/21
 * Github : http://github.com/sskim91
 */
@Controller
@RequestMapping("/template")
public class TemplateController {

    //템플릿 조각
    @GetMapping("/fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }

    //템플릿 레이아웃1
    @GetMapping("/layout")
    public String layout() {
        return "template/layout/layoutMain";
    }

    //템플릿 레이아웃2
    @GetMapping("/layoutExtend")
    public String layoutExtend() {
        return "template/layoutExtend/layoutExtendMain";
    }
}
