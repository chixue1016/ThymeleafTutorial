package it.aguzzo.tutorial.thymeleaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import it.aguzzo.tutorial.thymeleaf.web.conversion.DateFormatter;
import it.aguzzo.tutorial.thymeleaf.web.conversion.VarietyFormatter;

@Configuration
public class WebStaticResourcesConfiguration extends WebMvcConfigurerAdapter {
	
	/**
	 *  Dispatcher configuration for serving static resources
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
	}

	/**
	 * Add formatter for class {@link thymeleafexamples.stsm.business.entities.Variety}
	 * and {@link java.util.Date} in addition to the one registered by default
	 */
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(varietyFormatter());
		registry.addFormatter(dataFormatter());
	}
	
	/* ******************************************************************* */
	/*  Defines callback methods to customize the Java-based configuration */
	/*  for Spring MVC enabled via {@code @EnableWebMvc}                   */
	/* ******************************************************************* */

	@Bean
	public VarietyFormatter varietyFormatter() {
		return new VarietyFormatter();
	}

	@Bean
	public DateFormatter dataFormatter() {
		return new DateFormatter();
	}
}