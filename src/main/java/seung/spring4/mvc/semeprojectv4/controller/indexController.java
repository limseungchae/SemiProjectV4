package seung.spring4.mvc.semeprojectv4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
        return "index.tiles";
    }

    @GetMapping("/intro")
    public String intro() {
        return "intro.tiles";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin.tiles";
    }
}