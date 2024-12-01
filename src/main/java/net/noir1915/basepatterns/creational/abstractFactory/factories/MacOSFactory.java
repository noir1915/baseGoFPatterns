package net.noir1915.basepatterns.creational.abstractFactory.factories;

import net.noir1915.basepatterns.creational.abstractFactory.buttons.Button;
import net.noir1915.basepatterns.creational.abstractFactory.buttons.MacOSButton;
import net.noir1915.basepatterns.creational.abstractFactory.checkboxes.Checkbox;
import net.noir1915.basepatterns.creational.abstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
