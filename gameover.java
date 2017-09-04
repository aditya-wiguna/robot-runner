import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends World
{

    /**
     * Constructor for objects of class gameover.
     * 
     */
    public gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        exito exito = new exito();
        addObject(exito,471,179);
        exito.act();
        exito.setLocation(499,113);
        exito.setLocation(492,131);
        exito.setLocation(492,130);
        reload reload = new reload();
        addObject(reload,432,316);
        reload.act();
        reload.setLocation(305,302);
        reload.setLocation(113,294);
    }
}
