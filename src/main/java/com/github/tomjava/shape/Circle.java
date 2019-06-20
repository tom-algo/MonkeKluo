package com.github.tomjava.shape;

import lombok.Getter;

@Getter
public class Circle {
    /**
     * the center dimension of circle
     * x: x dimension
     * y: y dimension
     */
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * if this circle contain point(x,y)
     * @param x
     * @param y
     * @return
     */
    public boolean contain(int x, int y){
        return (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y) <= radius * radius;
    }
}
