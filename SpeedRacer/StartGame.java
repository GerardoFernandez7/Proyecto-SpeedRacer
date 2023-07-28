import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartGame extends World
{

    /**
     * Constructor for objects of class StartGame.
     * 
     */
    public StartGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(612, 433, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public void act(){
    if(Greenfoot.isKeyDown("Enter"))
    Greenfoot.setWorld(new MyWorld());
    }
}
