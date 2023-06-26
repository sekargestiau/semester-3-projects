import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Actor
{
    private int healthpoint;
    
    public void moveBullet(){
        setLocation(getX(),getY()+5);
        if(getY()>590){
            getWorld().removeObject(this);
        }else{
            hitCheck();
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
    
    public void act(){
        moveBullet();
        
    }
}
