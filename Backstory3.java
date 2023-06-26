import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Backstory3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backstory3 extends World
{

    /**
     * Constructor for objects of class Backstory3.
     * 
     */
    public Backstory3()
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
