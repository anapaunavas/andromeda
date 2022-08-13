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
    
    public void act(){
        aumentar_dificultad();
        agregar_obstaculos();
    }
    public int getRandomNumber(int start, int end){
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }
    public void aumentar_numero_adelantamiento(){
        numero_adelantamiento++;
    }
    public void disminuir_numero_obstaculos(){
        num_obstaculos--;
    }
    
    public void aumentar_dificultad(){
        if (numero_adelantamiento == numero_adelant_nivel){
            numero_adelantamiento = 0;
            numero_adelant_nivel = numero_adelant_nivel + 2;
            velocidad_ovni++;
            level.add(1);
            principal.aumentar_velocidad();
        }
    }
    public void agregar_obstaculos(){
        if(num_obstaculos == 0){
            int carril = getRandomNumber(0,3);
            if (carril == 0){
                addObject(new meteoro(velocidad_ovni), 175, 80);
            }
            else if(carril == 1){
                addObject(new meteoro(velocidad_ovni), 300, 60);
            }
            else{
                addObject(new roca(velocidad_ovni), 430, 80);
            }
            carril++;
            carril = carril%3;
            if (carril == 0){
                addObject(new meteoro(velocidad_ovni), 175, 80);
            }
            else if(carril == 1){
                addObject(new meteoro(velocidad_ovni), 300, 60);
            }
            else{
                addObject(new roca(velocidad_ovni), 430, 80);
            }
            num_obstaculos = 2;
        }
    }
}
