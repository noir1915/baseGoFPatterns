package net.noit1915.basepatterns.creational.factoryMethod.factory;

import net.noit1915.basepatterns.creational.factoryMethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        // ... остальной код диалога ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    public abstract Button createButton();

}
