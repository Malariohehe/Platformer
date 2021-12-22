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
    /**
     * if the seed hits a certain x position 
     * it will reset to it's previous location
     */
    public void reset()
    {
        if (getX() >= 999)
        {
            setLocation(1, 221);
        }
    }
    /**
     * used to get rid of the slime if they are touching,
     * quick fix to get sent to loser world after hitting the seed.
     */
    public void killSlime()
    {
        if (isTouching(Slime.class))
        {
            removeTouching(Slime.class);
            Greenfoot.setWorld(new Loser());
            Greenfoot.stop(); 
        }
    }
    

}
    
    
    

