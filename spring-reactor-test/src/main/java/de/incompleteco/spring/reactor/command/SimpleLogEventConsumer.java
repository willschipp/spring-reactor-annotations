package de.incompleteco.spring.reactor.command;

import reactor.fn.Consumer;
import reactor.fn.Event;
import reactor.spring.context.annotation.On;
import de.incompleteco.spring.reactor.domain.LogEvent;

public class SimpleLogEventConsumer implements Consumer<Event<LogEvent>> {
	
	@On(reactor="log.event.reactor",selector="log.event")	
	public void accept(Event<LogEvent> event) {
		System.out.println(Thread.currentThread().getId() + " " + event.getData());
	}

}