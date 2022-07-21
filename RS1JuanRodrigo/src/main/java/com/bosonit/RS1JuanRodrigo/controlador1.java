package com.bosonit.RS1JuanRodrigo;

import org.springframework.web.bind.annotation.*;

@RestController
public class controlador1 {


    @PostMapping("/greeting")
    public Greeting getInfoHail(@RequestBody Greeting great, @RequestParam(value = "name")String content){
        great.setContent(content);
        return great;
    }

    @GetMapping("/user/{id}")
    public Greeting getInfoid(@RequestBody Greeting great,@RequestParam(value = "id")int id){
        great.setId(id);
        return great;
    }
    @PutMapping("/post")
    public  String postVar (@RequestParam (value = "var1") int var1 , @RequestParam(value = "var2") int var2){
        return "value1:" + var1 + "value2:" + var2;
    }
}
