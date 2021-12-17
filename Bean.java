import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bean extends Actor
{
      private int speed = 7;
      private int vSpeed = 1;
      private int acceleration = 0;
      private int jumpStrength = 20;
    
    /**
     * Act - do whatever the Bean wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        killSlime();
        fall();
        onGround();
        checkFall();
    }

    private void killSlime()
    {
        if(isTouching(Slime.class))
        {
            removeTouching(Slime.class);
        }
    }
    
         public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
         return under != null;
    }
    
    
        public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
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
