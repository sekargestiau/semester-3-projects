import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossEnemy extends Actor
{
   public int hold = 30;
    private int interlude = 0;
    
    public void moveEnemy()
    {
        setLocation(getX(), getY());
    }
    
    public void act() 
    {
        moveEnemy();
        if(hold == 0){
            hold = 30;
        }
        if(interlude > 0)interlude--;
        if(interlude == 1)getWorld().addObject(new EnemyBullet(),getX(), getY()+50);
        if(interlude == 0)interlude = 500;
    }
}
