import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seed extends Actor
{
    /**
     * Act - do whatever the Seed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        reset();
        killSlime();
    }
    
    public void reset()
    {
        if (getX() >= 999)
        {
            setLocation(1, 221);
        }
    }
    
    public void killSlime()
    {
        if (isTouching(Slime.class))
        {
            removeTouching(Slime.class);
        }
    }
    

}
    
    
    

