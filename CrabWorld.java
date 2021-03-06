import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    private Lobster lobster;
    private Crab crab;
    private GreenfootSound musica;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld(int totalGusanos)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo, 60, 20);
        lobster = new Lobster();
        addObject(lobster,53,65);
        crab = new Crab();
        addObject(crab,227,476);
        prepare(totalGusanos);
        
        musica = new GreenfootSound("ufo-t-balt.mp3");
    }
    
    public void started()
    {
        musica.playLoop();
    }
    
    public void stopped()
    {
        musica.pause();
    }
    
    public Lobster accedeLangosta()
    {
        return lobster;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare(int numGusanos)
    {

        
        for (int i =0; i < numGusanos; i++)
        {
            int x = Greenfoot.getRandomNumber(540) + 20;
            int y = Greenfoot.getRandomNumber(520) + 20;
            Worm w = new Worm();
            this.addObject(w, x, y);
        }
        
    }
}
