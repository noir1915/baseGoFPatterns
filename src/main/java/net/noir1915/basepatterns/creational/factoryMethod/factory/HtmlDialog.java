package net.noir1915.basepatterns.creational.factoryMethod.factory;

import net.noir1915.basepatterns.creational.factoryMethod.buttons.Button;
import net.noir1915.basepatterns.creational.factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
