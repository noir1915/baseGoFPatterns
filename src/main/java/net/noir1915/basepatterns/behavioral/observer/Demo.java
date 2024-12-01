package net.noit1915.basepatterns.behavioral.observer;

import net.noit1915.basepatterns.behavioral.observer.editor.Editor;
import net.noit1915.basepatterns.behavioral.observer.listeners.EmailNotificationListener;
import net.noit1915.basepatterns.behavioral.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
