package de.incompleteco.spring.reactor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.Reactor;
import reactor.fn.Consumer;
import reactor.fn.Event;
import reactor.spring.context.ConsumerBeanPostProcessor;
import reactor.spring.context.ReactorFactoryBean;
import de.incompleteco.spring.reactor.command.SimpleLogEventConsumer;
import de.incompleteco.spring.reactor.domain.LogEvent;

@Configuration
public class AppConfig {

	@Bean
	public Reactor reactor() throws Exception {
		ReactorFactoryBean factory = new ReactorFactoryBean();
		factory.setName("log.event.reactor");
		//return
		return factory.getObject();
	}
	
	@Bean
	public Consumer<Event<LogEvent>> consumer() {
		return new SimpleLogEventConsumer();
	}
	
	@Bean
	public ConsumerBeanPostProcessor consumerBeanPostProcessor() {
		return new ConsumerBeanPostProcessor();
	}
}
