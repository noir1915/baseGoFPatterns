package net.noit1915.basepatterns.behavioral.visitor.visitors;

import net.noit1915.basepatterns.behavioral.visitor.shapes.Circle;
import net.noit1915.basepatterns.behavioral.visitor.shapes.CompoundShape;
import net.noit1915.basepatterns.behavioral.visitor.shapes.Dot;
import net.noit1915.basepatterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
