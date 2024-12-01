package net.noit1915.basepatterns.creational.abstractFactory.factories;

import net.noit1915.basepatterns.creational.abstractFactory.buttons.Button;
import net.noit1915.basepatterns.creational.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
