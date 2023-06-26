import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ending2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ending2 extends World
{

    /**
     * Constructor for objects of class Ending2.
     * 
     */
    public Ending2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
