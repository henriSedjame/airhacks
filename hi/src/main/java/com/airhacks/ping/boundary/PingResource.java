package com.airhacks.ping.boundary;

import com.airhacks.metrics.control.PingCounter;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.metrics.annotation.Metered;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    PingCounter counter;

    @GET
    @Metered
    public String ping() {
        this.counter.nextPing();
        return "Enjoy Java EE 8!";
    }

}
