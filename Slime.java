import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
  private int speed = 7;
  private int vSpeed = 1;
  private int acceleration = 1;
  private int jumpStrength = 20;
    /**
     */
    public void act() 
    {
        checkKeys();
        onGround();
        checkFall();
        checkForFall();
        win();
        lose();
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
        detectPlatform();
    }
    
    public void detectPlatform()


    {
	for (int i = 0; i < vSpeed; i++)
	{
		Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
		if (under != null)
		{
			vSpeed = i;
		}
	}
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
    
    public void checkForFall()
    {
        if (getY() >= 643)
        {
            setLocation(20, 595);
        }
    }
    public void win()
    {
        Actor Home = getOneIntersectingObject(Home.class);
        if (Home != null)
        {
            Greenfoot.setWorld(new Win());
            Greenfoot.stop();
        }
    }
    public void lose()
    {
        Actor Bean = getOneIntersectingObject(Bean.class);
        if (Bean != null)
        {
            Greenfoot.setWorld(new Loser());
            Greenfoot.stop();
        }
    }
    
}

    
    
