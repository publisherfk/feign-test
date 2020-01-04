package com.heshi.service02.controller;

import com.heshi.api1.client.Ref01Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fukun
 */
@RestController
public class Ref02Controller {
    @Autowired
    private Ref01Client ref01Client;

    @RequestMapping("/ref01Client")
    public String ref01GetSomeString() {
        return ref01Client.getSomeThing();
    }
}
