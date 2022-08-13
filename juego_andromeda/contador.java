import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador extends Actor
{
    private int value = 0;
        private int target = 0;
        private String text;
        private int stringLength;
        
        public contador(){
            this("");
        }
        public contador(String prefix)
    {
        text = prefix;
        /*convierte string a imagen*/
        stringLength = (text.length() + 2) * 16;
        
        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(13.0F));
        image.setColor(Color.WHITE);
        
        updateImage();
    }
    /**
     * Act - do whatever the contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (value < target) {
            value++;
            updateImage();
        }
        else if(value > target){
            value--;
            updateImage();
        }
    }
    //incrementa el contador
    public void add(int score){
        target += score;
    }
    public void subtract(int score){
        target -= score;
    }
    //obtener el valor del contador
    public int getValue(){
        return value;
    }
    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 10);
    }
}
