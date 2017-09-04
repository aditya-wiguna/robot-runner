import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exito extends Actor
{
    /**
     * Act - do whatever the exito wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage ex = getImage();
        ex.scale(50, 50);
        setImage(ex);
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new home());
        }
    }    
}
