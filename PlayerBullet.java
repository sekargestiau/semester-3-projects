import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerBullet extends Actor{
    public void moveBullet(){
        setLocation(getX(),getY()-5);
        if(getY()<10){
            getWorld().removeObject(this);
        }else{
            hitCheck();
        }
    }
    
    public void hitCheck(){
        int BossHit = 0;
        if(isTouching(Enemy.class)){
            getWorld().addObject(new Explosion(), getX(), getY());
            BackgroundSpace world = (BackgroundSpace)getWorld();
            world.addScore(20);
            
            Greenfoot.playSound("explosion1.wav");
            removeTouching(Enemy.class);
        }
        
         if(isTouching(Enemy2.class)){
            getWorld().addObject(new Explosion(), getX(), getY());
            BackgroundSpace world = (BackgroundSpace)getWorld();
            world.addScore(20);
            
            Greenfoot.playSound("explosion1.wav");
            removeTouching(Enemy2.class);
        }
        
         if(isTouching(BossEnemy.class)){
            getWorld().addObject(new Explosion(), getX(), getY());
            BackgroundSpace world = (BackgroundSpace)getWorld();
            BossHit++;
            world.addScore(25);
            Greenfoot.playSound("explosion1.wav");
        }
    }
    
    public void act(){
        moveBullet();
    }
}
