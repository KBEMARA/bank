package org.slsid;

import org.slsid.rmi.banqueRmiRemote;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class configurationApi {
/*
@Bean
public RmiServiceExporter getRmiService(ApplicationContext ctx) {
	RmiServiceExporter exporter = new RmiServiceExporter();
	exporter.setService(ctx.getBean("myRmiService"));
	exporter.setRegistryPort(1099);
	exporter.setServiceName("KARIM");
	exporter.setServiceInterface(banqueRmiRemote.class);
	return exporter;
}
*/
}
