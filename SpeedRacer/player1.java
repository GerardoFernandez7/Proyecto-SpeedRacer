import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player1 extends Actor
{
    private int velocidad;
    public player1(int v){
        velocidad = v;
    }
    /**
     * Act - do whatever the player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //movimiento arriba
        if (Greenfoot.isKeyDown("up")){
            if(getY()>280)
            setLocation(getX(),getY()-velocidad);
        }
        //movimiento abajo
        //arreglar limite de abajo
        if (Greenfoot.isKeyDown("down")){
            if (getY()<425)
            setLocation(getX(),getY()+velocidad);
        }
        if (Greenfoot.isKeyDown("right")){
            if(getX()<950)
            setLocation(getX()+velocidad,getY());
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-velocidad,getY());
        }
        checkCollision();
        Greenfoot.playSound("formula1racing.wav");
    }
//choques
public void checkCollision(){
Actor collided = getOneIntersectingObject(enemy.class);
    if (collided!=null){
    getWorld().removeObject(collided);
    getWorld().removeObject(this);
    Greenfoot.stop();
    Greenfoot.setWorld(new GameOver());
    
    
}
}
public void aumenta_velocidad(){
velocidad++;
}
}