import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player1 here.
 * Esta clase define lo que puede hacer el jugador y lo que no puede hacer
 * @author (Gerardo Fernandez) 
 * @version (7/25/23)
 */
public class player1 extends Actor
{
    /**
     * Act - do whatever the player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int velocidad;
    
    public player1 (int v) {
        velocidad = v;
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("up")){
            if (getY() > 280)
            setLocation(getX(),getY()- velocidad);
        }
        if (Greenfoot.isKeyDown("down")){
            if (getY() < 425)
            setLocation(getX(),getY()+ velocidad);
        }
        if (Greenfoot.isKeyDown("right")){
            if (getX() < 950)
            setLocation(getX()+ velocidad,getY());
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()- velocidad,getY());
        }
    }
    public void checkCollision(){
        Actor collided = getOneIntersectingObject(enemy.class);
        if(collided != null){
            getWorld().removeObject(collided);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
