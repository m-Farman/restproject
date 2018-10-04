package com.farman.restproject.model.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "note")
public class Note {

	private String to;

	private String from;

	private String heading;

	private String body;

//	@XmlElement(name = "to")
	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

//	@XmlElement(name = "from")
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

//	@XmlElement(name = "heading")
	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

//	@XmlElement(name = "body")
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Note [to=" + to + ", from=" + from + ", heading=" + heading + ", body=" + body + "]";
	}

}
