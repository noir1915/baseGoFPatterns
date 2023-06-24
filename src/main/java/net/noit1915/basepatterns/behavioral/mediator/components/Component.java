package net.noit1915.basepatterns.behavioral.mediator.components;

import net.noit1915.basepatterns.behavioral.mediator.components.mediators.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
