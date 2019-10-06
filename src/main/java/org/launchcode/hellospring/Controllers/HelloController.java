package org.launchcode.hellospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {

    @RequestMapping(value= "")
    @ResponseBody
    public String index(){
        return "Hello World";
    }

    @RequestMapping
    @ResponseBody
    public String goodbye(){
        return "Goodbye";
    }
}
