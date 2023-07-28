import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * Esta clase es la encargada presentar y configurar los parametros de los
 * enemigos
 * @author (Gerardo Fernandez) 
 * @version (27/7/23)
 */
public class enemy extends Actor
{
    private int speed;
    
    public enemy(int v){
        speed = v;
    }
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() - speed, getY()); // Modifica ambas coordenadas para que el enemigo se mueva horizontalmente
        if (getX() <= 0) { // Comprueba si ha llegado al borde derecho del mundo
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
        }
    }
}
