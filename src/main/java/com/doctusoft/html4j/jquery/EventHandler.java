package com.doctusoft.html4j.jquery;

public abstract class EventHandler {
	public abstract void eventComplete(JQEvent event, JQuery currentJQuery);
	
	static public void fire(EventHandler handler, JQEvent event, JQuery currentJQuery) {
		handler.eventComplete(event, currentJQuery);
	}
}
