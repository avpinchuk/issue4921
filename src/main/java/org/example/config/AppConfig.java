package org.example.config;

import org.example.resource.TestResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

@ApplicationPath("/")
public class AppConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Collections.singleton(TestResource.class);
    }
}
