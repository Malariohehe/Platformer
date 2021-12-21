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
  private int jumpStrength = 17;
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
        huh();
    }
    /**
     * checks to see if the slime is on a platform or not.
     */
     public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
         return under != null;
    }
    /**
     * used to set the keys that are used to move
     * && onGround() is so that the slime can only jump while on the ground.
     */
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
   
    /**
     * if the slime is moving right the x value goes up.
     */
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    /**
     * if the slime is moving left the x value goes down.
     */
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    /**
     * used for the falling of the slime,
     * when in the air the slime will fall according to the vSpeed
     * and acceleration. It will then detect a platform and hopefully
     * not fall through it.
     */
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
    /**
     * this makes the slime jump, and after it is done jumping
     * it will fall.
     */
     public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    /**
     * checks if the slime is on the ground,
     * if it is the vSpeed is set to 0,
     * if it is not the slime falls.
     */
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
    /**
     * used to reset the spawn of the slime,
     * if it falls of the platform into the void it goes back to the 
     * starting location
     */
    public void checkForFall()
    {
        if (getY() >= 643)
        {
            setLocation(20, 595);
        }
    }
    /**
     * if the slime is intersecting the home
     * it changes the screen to the win screen and greenfoot stops running.
     */
    public void win()
    {
        Actor Home = getOneIntersectingObject(Home.class);
        if (Home != null)
        {
            Greenfoot.setWorld(new Win());
            Greenfoot.stop();
        }
    }
    /**
     * if the slime is intersecting the bean or seed
     * it sets the world to the lose screen and greenfoot stops running.
     */
    public void lose()
    {
        Actor Bean = getOneIntersectingObject(Bean.class);
        if (Bean != null)
        {
            Greenfoot.setWorld(new Loser());
            Greenfoot.stop();
        }
        Actor Seed = getOneIntersectingObject(Seed.class);
        if (Seed != null)
        {
            Greenfoot.setWorld(new Loser());
            Greenfoot.stop();
        }
    }
    public void huh()
    {
        Actor huh = getOneIntersectingObject(huh.class);
        if (huh != null)
        {
        Greenfoot.setWorld(new uhoh());
        Greenfoot.stop();
        }
    }
    
}

    
    
