import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Shield extends Actor
{
    /**
     * Act - do whatever the Shield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    
    public void act() 
    {
        setLocation(getX(),getY()+1);
        if(isAtEdge()){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
        if (isTouching(Airplane.class))
        {
            //getWorld().addObject(new Ledakan2(),getX(),getY());
            BackgroundSpace world = (BackgroundSpace)getWorld();
            world.updateHP(-0);
            getWorld().removeObject(this);
            //Greenfoot.playSound("explosion2.mp3");
        }
    }
}
