package net.noit1915.basepatterns.behavioral.visitor.shapes;

import net.noit1915.basepatterns.behavioral.visitor.visitors.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
