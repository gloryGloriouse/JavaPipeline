
import com.example.javapointpipeline.Point;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AUDREY
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class PointTest {
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AUDREY
 */

    @Test
    public void testCalculDistance() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 4);
        assertEquals(5.0, A.calculDistance(B), 0.01);
        System.out.println("Distance = " + A.calculDistance(B));
    }

    @Test
    public void testCalculMilieu() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 2);
        Point M = A.calculMilieu(B);
        assertEquals(1.0, M.x, 0.01);
        assertEquals(1.0, M.y, 0.01);
        System.out.println("Milieu = (" + M.x + "," + M.y + ")");
    }
}

