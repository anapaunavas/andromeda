import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteoro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meteoro extends Actor
{
    private int speed;
    
    public meteoro(int v) {
        speed = v;
    }
    /**
     * Act - do whatever the meteoro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);
        if( getY() >= getWorld().getHeight() - 1) {
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.aumentar_puntuacion(10);
            juego.disminuir_numero_obstaculos();
            juego.aumentar_numero_adelantamiento();
        }
    }
}
