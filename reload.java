import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reload here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reload extends Actor
{
    /**
     * Act - do whatever the reload wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage re = getImage();
        re.scale(50, 50);
        setImage(re);
        
        skor.jumlah_skor = 0;
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
