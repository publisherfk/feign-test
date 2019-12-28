package com.heshi.api1.client;

import com.heshi.api1.fallback.Ref01Fallback;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@ConditionalOnMissingClass("com.heshi.service01.provider.Ref01Provider")
@FeignClient(name = "ref011111111", fallback = Ref01Fallback.class)
public interface Ref01Client {
    String prefix = "/v1";

    @GetMapping(prefix + "/getSomeThing")
    public String getSomeThing();
}
