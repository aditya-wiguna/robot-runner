import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
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
        for(int i=0; i<=1; i++)
        {
            tong merah = new tong();
            this.addObject(merah, Greenfoot.getRandomNumber(1000000), 268);
        }
        
        for(int i=0; i<=1; i++)
        {
            jalan jalan = new jalan();
            this.addObject(jalan, 0, 350);
        }

        jalan jalan = new jalan();
        addObject(jalan,307,360);
        jalan.setLocation(301,349);
        jalan.setLocation(297,355);
        jalan.setLocation(299,352);
        robot robot = new robot();
        addObject(robot,116,238);
        robot.setLocation(104,229);
        jalan.setLocation(199,360);
        jalan.setLocation(300,351);
        jalan.setLocation(169,351);
        jalan.setLocation(298,353);
        jalan.setLocation(178,345);
        jalan.setLocation(299,350);
    }
}
