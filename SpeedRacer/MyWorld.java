import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private counter score;
    private int level;
    private int velocidad;
    private int adelantamientos;
    private int dificultad;
    private player1 jugador1;
    private int num_enemy;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 500, 1); 
        
        adelantamientos=0;
        dificultad=4;
        velocidad=2;
        
        score = new counter("");
        jugador1=new player1(velocidad);
        
        addObject(jugador1,40,350);   
        addObject(score, 250, 40); 
    }
    
    public void act(){
        aumentar_dificultad();
        add_enemy();
    }
    
    public int getRandomNumber(int start, int end){
    int normal= Greenfoot.getRandomNumber(end-start+1);
    return normal+start;
    }
    
    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }
    
    public void aumentar_adelantamiento(){
    adelantamientos++;
    }
    
    public void disminuir_enemy(){
    num_enemy--;
    }

    public void aumentar_dificultad(){
    if(adelantamientos==dificultad){
    adelantamientos=0;
    dificultad=dificultad+2;
    velocidad++;
    jugador1.aumenta_velocidad();
        }
    }
    
    public void add_enemy(){
    if(num_enemy==0){
    int carril=getRandomNumber(0,3);
    
    if (carril==0){
    addObject(new enemy(velocidad),1260,300);
    
    }
    else if(carril==1){
        addObject(new enemy(velocidad),1260,350);
        
    }
    else{
    addObject(new enemy(velocidad),1260,417);
    
    }
    carril++;
    carril=carril%3;
    if (carril==0){
    addObject(new enemy(velocidad),1260,246);
    
    }
    else if(carril==1){
        addObject(new enemy(velocidad),1260,350);
        
    }
    else{
    addObject(new enemy(velocidad),1260,417);
    
            }
    num_enemy=2;
        }
    }
    
}