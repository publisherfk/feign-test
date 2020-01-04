package com.heshi.api1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Reno Chou
 */
@ConfigurationProperties("hystrix.propagate.request-attribute")
public class HystrixRequestAttributeProperties {

    /**
     * Enable Hystrix propagate http request and response. Defaults to true.
     */
    private Boolean enabled = Boolean.TRUE;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}