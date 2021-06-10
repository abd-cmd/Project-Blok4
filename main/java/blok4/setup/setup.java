package blok4.setup;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("filedatasysteem")
public class setup extends ResourceConfig {
    public setup() {
        packages("blok4.backend");
    }
}

