import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    public int hold = 30;
    private int interlude = 0;
    
    public void moveEnemy()
    {
        setLocation(getX(), getY()+1);
        if(getY()>500){
            setLocation(Greenfoot.getRandomNumber(500),
            Greenfoot.getRandomNumber(50));
        }
    }
    
    public void hitCheck(){
        if (isTouching(Airplane.class)|| isTouching(Airplane2.class))
        {
            //getWorld().addObject(new Ledakan2(),getX(),getY());
            BackgroundSpace world = (BackgroundSpace)getWorld();
            world.updateHP(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("explosion2.mp3");
        }
    }
    
    public void act() 
    {
        moveEnemy();
        hitCheck();
        if(hold == 0){
            hold = 30;
        }
        if(interlude > 0)interlude--;
        if(interlude == 0)interlude = 120;
    }
}
