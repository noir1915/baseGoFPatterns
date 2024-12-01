package net.noir1915.basepatterns.creational.abstractFactory;

import net.noir1915.basepatterns.creational.abstractFactory.app.Application;
import net.noir1915.basepatterns.creational.abstractFactory.factories.GUIFactory;
import net.noir1915.basepatterns.creational.abstractFactory.factories.MacOSFactory;
import net.noir1915.basepatterns.creational.abstractFactory.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
