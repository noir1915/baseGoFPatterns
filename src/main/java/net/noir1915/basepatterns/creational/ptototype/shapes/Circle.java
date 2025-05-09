package net.noir1915.basepatterns.creational.ptototype.shapes;

import java.awt.*;

public class Circle extends Shape {
    public int radius;

    public Circle(int i, int i1, int i2, Color blue) {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
