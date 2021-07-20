package com.example.demo.Api;


import org.springframework.web.bind.annotation.*;

@RequestMapping("")
@RestController
@CrossOrigin("*")
public class Main_app {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String greeting() {

        System.out.println("done");
        return "The Server is work";

    }

}
