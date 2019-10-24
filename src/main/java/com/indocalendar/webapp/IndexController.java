package com.indocalendar.webapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(value={"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "hi you ";
    }
}
