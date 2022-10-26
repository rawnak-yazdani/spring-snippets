package io.welldev;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    /**
     * This overriden method of bean will be called when the container publishes a start event
     */
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent Received CStartEventHandler");
    }
    public void onApplicationEvent2() {
        System.out.println("ContextStartedEvent Received 2");
    }
}
