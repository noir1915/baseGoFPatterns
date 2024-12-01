package net.noir1915.basepatterns.creational.abstractFactory.factories;

import net.noir1915.basepatterns.creational.abstractFactory.buttons.Button;
import net.noir1915.basepatterns.creational.abstractFactory.buttons.WindowsButton;
import net.noir1915.basepatterns.creational.abstractFactory.checkboxes.Checkbox;
import net.noir1915.basepatterns.creational.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
