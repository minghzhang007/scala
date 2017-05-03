package com.lewis.scala.learn.trait;

import com.lewis.scala.learn.Point;

/**
 * Created by Administrator on 2017/4/17.
 */
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(31, 20);
        Point p2 = new Point(31, 24);
        System.out.println(p1.getX());
        System.out.println(p2.getY());
        System.out.println(p1.isEqual(p2));
    }
}
