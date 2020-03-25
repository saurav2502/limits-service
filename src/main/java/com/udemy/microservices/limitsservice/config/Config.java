package com.udemy.microservices.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-service")
@Component
public class Config {
    private int maximum;
    private int minimum;

    public Config(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public Config() {
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "Config{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}
