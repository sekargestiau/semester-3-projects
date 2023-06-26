import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Airplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airplane extends Actor{
    public int hold = 10;
    private int interlude = 0;
    private int healthpower;
    
    public void actPlayer(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }
        if (hold == 0){
            if(Greenfoot.isKeyDown("Space")){
               getWorld().addObject(new PlayerBullet(),getX(),getY());
               Greenfoot.playSound("bullet.wav");
            }
            hold=10;
        }
    }
                
    public void act(){
        hold--;
        actPlayer();
        if(interlude > 0)interlude--;
        if(interlude == 1)
        if(interlude == 0)interlude = 20;
    }
}
