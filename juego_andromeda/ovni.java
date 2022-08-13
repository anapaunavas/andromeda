import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ovni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ovni extends Actor
{
    private int speed;
    
    public ovni(int v) {
        speed = v;
    }
    
    /**
     * Act - do whatever the ovni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            if(getX() < 440)
                setLocation(getX() + speed, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            if(getX() > 160)
                setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY() > 160)
                setLocation(getX() , getY() - speed);
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY() < 370)
                setLocation(getX() , getY() + speed);
        }
    }
    
    public void checkCollision(){
        Actor collided = getOneIntersectingObject(meteoro.class);
        if(collided !=null){
            getWorld().removeObject(collided);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    
    public void aumentar_velocidad(){
        speed++;
    }
}

