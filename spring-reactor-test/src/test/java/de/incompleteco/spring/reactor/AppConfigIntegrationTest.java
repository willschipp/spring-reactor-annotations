package de.incompleteco.spring.reactor;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import reactor.Fn;
import reactor.core.Reactor;
import de.incompleteco.spring.reactor.domain.LogEvent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class AppConfigIntegrationTest {

	@Resource
	private Reactor reactor;
	
	@Test
	public void test() throws Exception {
		
		//lets send some stuff
		LogEvent logEvent = new LogEvent();
		logEvent.setMessage("hello world");
		logEvent.setTimestamp(new Date());
		logEvent.setSource("test");
		
		//send 
		reactor.notify("log.event", Fn.event(logEvent));
		System.out.println("after notified");
		//just wait a little
		Thread.sleep(100);
		
	}	
	
}
