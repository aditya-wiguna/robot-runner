import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jalan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jalan extends Actor
{
    /**
     * Act - do whatever the jalan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x-6,y);
        
        if(x == 0)
        {
            this.setLocation(600, 350);
        }
    }    
}
