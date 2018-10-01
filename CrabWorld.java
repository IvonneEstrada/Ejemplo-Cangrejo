import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo, 60, 20);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,53,65);
        Crab crab = new Crab();
        addObject(crab,227,476);
        Worm worm = new Worm();
        addObject(worm,321,70);
        Worm worm2 = new Worm();
        addObject(worm2,415,173);
        Worm worm3 = new Worm();
        addObject(worm3,219,206);
        Worm worm4 = new Worm();
        addObject(worm4,45,308);
        Worm worm5 = new Worm();
        addObject(worm5,122,481);
        Worm worm6 = new Worm();
        addObject(worm6,302,350);
        Worm worm7 = new Worm();
        addObject(worm7,436,452);
        Worm worm8 = new Worm();
        addObject(worm8,482,284);
        Worm worm9 = new Worm();
        addObject(worm9,501,39);
        Worm worm10 = new Worm();
        addObject(worm10,167,90);
        Worm worm11 = new Worm();
        addObject(worm11,46,163);
        Worm worm12 = new Worm();
        addObject(worm12,197,324);
        Worm worm13 = new Worm();
        addObject(worm13,368,235);
        Worm worm14 = new Worm();
        addObject(worm14,508,178);
        Worm worm15 = new Worm();
        addObject(worm15,42,424);
    }
}
