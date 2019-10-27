package by.haapp.jwtspringsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloResource {

    @RequestMapping({"/hello"})
    public @ResponseBody String hello(){
        return "Hello World!";
    }

}
