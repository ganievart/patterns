package com.generic;

import java.awt.*;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */

interface HasColor {java.awt.Color getColor();}
interface Weight {int weight();}
class Dimension {public int x, y, z;}
class HoldItem<T> {
    T item;
    HoldItem(T item) {this.item = item;}
    T getItem() {return item;}
}

class Colored2<T extends HasColor> extends HoldItem<T> {
    Colored2(T item){super(item);}
    java.awt.Color color(){return item.getColor();}
}
class Coloreddimension2<T extends Dimension & HasColor> extends Colored2<T>{

    Coloreddimension2(T item) {
        super(item);
    }
    int getX() {return item.x;}
    int getY() {return item.y;}
    int getZ() {return item.z;}
}

class Solid2<T extends Dimension & HasColor & Weight> extends Coloreddimension2<T> {

    Solid2(T item) {
        super(item);
    }
    int weight() {return item.weight();}
}

class Bounded extends Dimension implements HasColor, Weight {

    public Color getColor() {
        return null;
    }

    public int weight() {
        return 0;
    }
}
public class InheritsBounds {
    public static void main(String[] args) {

        Solid2<Bounded> solid2 = new Solid2<Bounded>(new Bounded());
        solid2.color();
        solid2.getY();
        solid2.weight();
    }
}
