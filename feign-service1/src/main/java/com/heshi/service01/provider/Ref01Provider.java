package com.heshi.service01.provider;

import com.heshi.api1.client.Ref01Client;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@Primary
@RestController
public class Ref01Provider implements Ref01Client {
    @Override
    public String getSomeThing() {
        return "provider";
    }
}
