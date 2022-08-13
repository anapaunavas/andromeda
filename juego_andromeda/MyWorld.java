import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private contador score;
    private contador level;
    
    private int velocidad_ovni;
    private int numero_adelantamiento;
    private int numero_adelant_nivel;
    private ovni principal;
    private int num_obstaculos;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        numero_adelantamiento = 0;
        numero_adelant_nivel = 4;
        velocidad_ovni = 2;
        
        score = new contador("Puntos: ");
        level = new contador("Nivel: ");
        level.add(1);
        //llamar al constructor
        principal = new ovni(velocidad_ovni);
        
        addObject(principal, 305, 370);
        addObject(level, 100, 55);
        addObject(score, 100, 35);
    }
}
