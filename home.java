import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends World
{

    /**
     * Constructor for objects of class home.
     * 
     */
    
    public home()
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
        play play = new play();
        addObject(play,304,235);
        help help = new help();
        addObject(help,480,243);
        help.setLocation(488,234);
        play.setLocation(352,232);
        credit credit = new credit();
        addObject(credit,364,349);
        credit.setLocation(353,344);
        exit exit = new exit();
        addObject(exit,504,350);
        exit.setLocation(496,343);
        exit.setLocation(490,343);
    }
}
