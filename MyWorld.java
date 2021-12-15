import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 153, 324
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1); 
        
        Slime Slime = new Slime();
        addObject(Slime, 20, 595);
        
        addObject( new Bean(),966, 455 );
        addObject( new Bean(),153, 324);
        
        
        
        
        addObject(new Platform(), 107, 630);
        addObject( new Platform(), 324, 632);
        addObject( new Platform(),542, 594);
        addObject( new Platform(),892, 500);
        addObject( new Platform(),568, 367);
        addObject( new Platform(),200, 370);
        addObject( new Platform(),20, 262);
        addObject( new Platform(),284, 97);
        addObject( new Platform(),619, 184);
        addObject( new Platform(),836, 184);
        addObject( new Platform(),998, 184);
    }
}
