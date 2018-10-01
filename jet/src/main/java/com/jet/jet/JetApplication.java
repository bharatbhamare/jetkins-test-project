package com.jet.jet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jmx.export.MBeanExporter;



@SpringBootApplication
public class JetApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(JetApplication.class, args);
	}
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(JetApplication.class);
	    }

	  @Bean
		 public MBeanExporter exporter()
		 {
		     final MBeanExporter exporter = new MBeanExporter();
		     exporter.setAutodetect(true);
		     exporter.setExcludedBeans("dataSource");
		     return exporter;
		 }
}
