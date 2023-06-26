import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player1 extends Actor
{
    /**
     * Act - do whatever the MainMenuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*1.2),(int)Math.round(getImage().getHeight()*1.2));
       }
       if(Greenfoot.mousePressed(this)){
            Greenfoot.delay(5);
            Greenfoot.setWorld(new MainMenu());
       }
    }
}
