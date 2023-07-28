import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    private int velocidad;
    public enemy(int v){
    velocidad=v;
    }
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-velocidad,getY());
        if(getX()>=612){
        MyWorld juego = (MyWorld) getWorld();
        juego.removeObject(this);
    }
    Actor player1;
    player1 = getOneObjectAtOffset(0,0, player1.class);
    if (player1!=null){
    World world;
    world = getWorld();
    world.removeObject(player1);
    world.removeObject(this);
    
    
    }
    }
}
