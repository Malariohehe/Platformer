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
     * used to set the location of all the enemies, the slime,
     * and all of the platforms.
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
                Slime Slime = new Slime();
        addObject(Slime, 20, 595);

        addObject( new Bean(),892, 457);
        addObject( new Bean(),207, 324);
        addObject( new Bean(),637, 549);
        addObject( new Bean(),379, 65);
        addObject( new Bean(),392, 340);
        addObject( new Bean(),78, 400);

        addObject(new Home(), 943, 111);

        addObject(new Seed(), 1, 221);

        addObject(new Platform(), 107, 630);
        addObject( new Platform(), 324, 632);
        addObject( new Platform(),542, 594);
        addObject( new Platform(),892, 500);
        addObject( new Platform(),568, 367);
        addObject( new Platform(),200, 370);
        addObject( new Platform(),20, 262);
        addObject( new Platform(),284, 110);
        addObject( new Platform(),619, 184);
        addObject( new Platform(),836, 184);
        addObject( new Platform(),998, 184);
        addObject( new huh(), 50, 369);
    }
}
