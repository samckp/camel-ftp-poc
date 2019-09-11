package com.sam.camel.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FtpRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("{{fromRoute}}")
                .routeId("ftpRoute")
                .log(LoggingLevel.INFO, "${body}")
                .to("{{toRoute}}")
                ;
    }
}
