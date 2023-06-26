import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ending1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ending1 extends World
{

    /**
     * Constructor for objects of class Ending1.
     * 
     */
    public Ending1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Ending2());
        }
    }
}
