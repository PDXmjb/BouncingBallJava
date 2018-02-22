/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballjava;

/**
 *
 * @author Mike Brooks
 */
public class BouncingBallJava 
{
    public static void main(String args[])
    {
        System.out.println(bouncingBall(3.0, 0.66, 0.5));
    }
    
    /**
     * Determines the number of times a person watching out a window would 
     * see a ball pass.
     * @param h the initial height of the drop of the ball
     * @param bounce a value representing the decreasing height of the ball after multiple bounces
     * @param window height of the window of the viewer
     * @return 
     */
    public static int bouncingBall(double h, double bounce, double window) 
    {      
        if (h <= 0 || (bounce <= 0 || bounce >= 1) || (window >= h))
        {
            return -1;
        }

        // Will always fall past at least once.
        int timesSeen = 1;
        double bounceHeight = h * bounce;      

        while (bounceHeight > window)
        {
            bounceHeight = bounceHeight * bounce;
            timesSeen += 2;
        }
        return timesSeen;
    }

}
