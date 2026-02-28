/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.javapointpipeline;

/**
 *
 * @author AUDREY
 */
public class Point {
    
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculDistance(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    public Point calculMilieu(Point p) {
        return new Point((x + p.x)/2, (y + p.y)/2);
    }

    
}
