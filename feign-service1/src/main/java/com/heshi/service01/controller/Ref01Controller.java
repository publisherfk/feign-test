package com.heshi.service01.controller;

import com.heshi.api1.client.Ref01Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ref01Controller {
    @Autowired
    private Ref01Client ref01Client;

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("/getSomeThing")
    public String getSomeThing() {
        return ref01Client.getSomeThing();
    }
}
