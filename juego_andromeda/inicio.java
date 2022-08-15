import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inicio extends World
{
    flecha flecha = new flecha();
    private int opcion = 0; // 0 = start 1 = exit

    public inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new start(), 300, 250);
        addObject(new exit(), 304, 310);
        addObject(flecha, 195, 250);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}
        if(Greenfoot.isKeyDown("DOWN") && opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion=0; // no se decremente el valor
        if(opcion<0) opcion=1;
        
        flecha.setLocation(195,250 +(opcion*60));
        
        if(Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0: // start
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1: // exit
                    Greenfoot.stop();
                    break;
                }
            }
        }
    }
