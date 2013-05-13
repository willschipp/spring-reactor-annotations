package de.incompleteco.spring.reactor.domain;

import java.io.Serializable;
import java.util.Date;

public class LogEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	private String source;
	
	private Date timestamp;
	
	private String message;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LogEvent [source=" + source + ", timestamp=" + timestamp
				+ ", message=" + message + "]";
	}
	
	
}
