import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ovni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ovni extends Actor
{
    /**
     * Act - do whatever the ovni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    if(Greenfoot.isKeyDown("rigth")){
        setLocation(getX() + 1, getY());
    }
    if(Greenfoot.isKeyDown("left")){
        setLocation(getX() - 1, getY());
    }
    if(Greenfoot.isKeyDown("up")){
        setLocation(getX() , getY() -1);
    }
    if(Greenfoot.isKeyDown("down")){
        setLocation(getX() , getY() +1);
    }
    }
}
