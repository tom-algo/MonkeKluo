package com.github.tomjava.frame;

import com.github.tomjava.shape.Circle;
import org.junit.Test;

import java.awt.*;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class AlgoFrameTest {
    @Test
    public void render() throws Exception{
        int width = 1000;
        AlgoFrame algoFrame = new AlgoFrame("Hello", width, width);

        LinkedList<Point> points = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {

            int x = (int)(Math.random() * width);
            int y = (int)(Math.random() * width);

            Point p = new Point(x, y);
            points.add(p);
        }

        Circle circle = new Circle(500, 500, 500);

        algoFrame.render(circle, points);

        Thread.sleep(1000 * 100);
    }
}