package com.heshi.api1.fallback;

import com.heshi.api1.client.Ref01Client;
import org.springframework.stereotype.Component;

@Component
public class Ref01Fallback implements Ref01Client {

    @Override
    public String getSomeThing() {
        return "fallback";
    }
}
