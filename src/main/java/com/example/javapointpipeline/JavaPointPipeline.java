/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.javapointpipeline;

/**
 *
 * @author AUDREY
 */
public class JavaPointPipeline {

    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(3, 4);

        System.out.println("Distance = " + A.calculDistance(B));

        Point M = A.calculMilieu(B);
        System.out.println("Milieu = (" + M.x + "," + M.y + ")");
    }
}
