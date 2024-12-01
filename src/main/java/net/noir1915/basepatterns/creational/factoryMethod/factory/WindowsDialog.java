package net.noir1915.basepatterns.creational.factoryMethod.factory;

import net.noir1915.basepatterns.creational.factoryMethod.buttons.Button;
import net.noir1915.basepatterns.creational.factoryMethod.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
