package com.github.tomjava.frame;

import com.github.tomjava.shape.Circle;
import lombok.Setter;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.LinkedList;

public class AlgoVisualizer {
    private Circle circle;
    private LinkedList<Point> points;
    private int pointsNumber;

    private int insidePointsNumber = 0;

    @Setter
    private AlgoFrame frame;

    private int sceneWidth;

    private boolean isPaused;

    public AlgoVisualizer(int sceneWidth, int pointsNumber){
        this.sceneWidth = sceneWidth;
        this.pointsNumber = pointsNumber;
        circle = new Circle(sceneWidth / 2, sceneWidth / 2, sceneWidth / 2);
        points = new LinkedList<>();
    }

    public void run() throws InterruptedException{
        for (int i = 0; i < pointsNumber; i++) {


            if (i % 100 == 0) {
                frame.render(circle, points);
                // because render is slow and async
                Thread.sleep(i / 20);
                double pi = 4 * (double)insidePointsNumber / points.size();
                System.out.println(pi);
            }


            int x = (int)(Math.random() * frame.getCanvasWidth());
            int y = (int)(Math.random() * frame.getCanvasHeight());

            Point p = new Point(x, y);
            if (circle.contain(p.x, p.y)){
                insidePointsNumber++;
            }

            points.add(p);
        }
    }
}
