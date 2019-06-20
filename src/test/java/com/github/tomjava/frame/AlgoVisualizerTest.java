package com.github.tomjava.frame;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoVisualizerTest {

    @Test
    public void run() throws Exception{
        int sceneWidth = 1000;
        AlgoVisualizer algoVisualizer = new AlgoVisualizer(sceneWidth, 10000);
        AlgoFrame frame = new AlgoFrame("Hello", sceneWidth, sceneWidth);
        algoVisualizer.setFrame(frame);

        algoVisualizer.run();
    }
}