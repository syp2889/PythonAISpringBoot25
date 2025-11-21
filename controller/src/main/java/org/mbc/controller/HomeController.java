package org.mbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //URL 분기를 담당함
public class HomeController {
    
    
    @GetMapping("/")// http://localhost:8000/ 반응하는 메서드
    //@ResponseBody
    public String home(){ 
        return "index";
        //resources/templates/index.html을 응답한다.
    }
    
}