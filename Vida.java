import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    private Counter vidas;
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Vida()
    {
        vidas = new Counter("Vidas: ");
        vidas.setValue(3);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
