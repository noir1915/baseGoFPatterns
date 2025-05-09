package net.noir1915.basepatterns.creational.abstractFactory.app;

import net.noir1915.basepatterns.creational.abstractFactory.buttons.Button;
import net.noir1915.basepatterns.creational.abstractFactory.checkboxes.Checkbox;
import net.noir1915.basepatterns.creational.abstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
