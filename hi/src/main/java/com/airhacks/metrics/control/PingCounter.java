
package com.airhacks.metrics.control;

import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.metrics.annotation.Gauge;

/**
 *
 * @author airhacks.com
 */
@ApplicationScoped
public class PingCounter {

    AtomicInteger count;

    @PostConstruct
    public void init() {
        this.count = new AtomicInteger();
    }

    @Gauge(unit = "count")
    public int pingCount() {
        return this.count.get();
    }

    public void nextPing() {
        this.count.incrementAndGet();
    }


}
