package org.wildfly.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GettingStartedService {

    public String hello(String name) {
        return String.format("Hello '%s'.", name);
    }

}
