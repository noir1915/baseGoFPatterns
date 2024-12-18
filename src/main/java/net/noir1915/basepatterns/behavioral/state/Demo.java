package net.noir1915.basepatterns.behavioral.state;

import net.noir1915.basepatterns.behavioral.state.ui.Player;
import net.noir1915.basepatterns.behavioral.state.ui.UI;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
