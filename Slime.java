import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
  private int speed = 5;
  private int vSpeed = 0;
  private int acceleration = 1;
  private int jumpStrength = 15;
    /**
     */
    public void act() 
    {
        checkKeys();
        onGround();
        checkFall();
    }
    
     public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        return under != null;
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        } 
        if (Greenfoot.isKeyDown("up") && onGround())
        {
            jump();
        }
    }
    
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    
    public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
    }
    
     public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    
}
