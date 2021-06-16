package blok4.setup;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("restservices")
public class setup extends ResourceConfig {
    public setup() {
        packages("blok4.backend", "blok4.loginbeschermen");
        register(RolesAllowedDynamicFeature.class);
    }
}

