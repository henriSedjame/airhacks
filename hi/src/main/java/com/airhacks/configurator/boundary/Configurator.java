
package com.airhacks.configurator.boundary;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author airhacks.com
 */
public class Configurator {

    @Produces
    public String create(InjectionPoint ip) {
        String fieldName = ip.getMember().getName();
        return System.getenv().getOrDefault(fieldName, System.getProperty(fieldName, "-- please configure--!"));
    }


}
