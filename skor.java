import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skor extends World
{
    static int jumlah_skor = 0;
    /**
     * Constructor for objects of class skor.
     * 
     */
    public skor()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public static void skor_berkurang()
    {
        jumlah_skor = jumlah_skor + 1;
        
        if(jumlah_skor <= 0)
        {
            Greenfoot.setWorld(new gameover());
        }
    }
}
