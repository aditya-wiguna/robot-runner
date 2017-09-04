import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robot extends Actor
{
    /**
     * Act - do whatever the robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Bagian Umum
    private boolean jatuh;
    private int y = 0;
    private int speed = 1;
    private int up = 20;
    //Bagian Animasi
    private GreenfootImage[] images = new GreenfootImage[8];
    private int jeda=15, num=1;
    
    public void addedToWorld(World MyWorld)
    {
        for(int i=1; i<images.length; i++){
            images[i] = new GreenfootImage("Run ("+i+").png");
        }
        setImage(images[1]);
    }
    
    public void act() 
    {
        // Add your action code here.
        getWorld().showText("Score: "+skor.jumlah_skor,85,30);
        
        if(jeda == 0) jeda=3;
        if(jeda == 1){
            setImage(images[num]);
            num++;
            if(num >= images.length) num=1;
        }
        if(jeda>0)jeda--;
        
        //Loncat dan gerak
        skor.jumlah_skor+=1;
        move();
        tabrak();
        check();
    }
    
    public void move()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            jump();
            setImage(new GreenfootImage("Jump (5).png"));
        }
    }
    
    public void jump()
    {
        if(jatuh == false)
        {
            y = y - up;
            
            down();
            setImage(new GreenfootImage("Jump (5).png"));
        }
    }
    
    public void down()
    {
        jatuh = true;
        setLocation(getX(), getY() + y);
        y = y + speed;
    }
    
    public boolean jalan()
    {
        jatuh = false;
        Actor jalan = getOneObjectAtOffset(0, getImage().getHeight()/1-70, jalan.class);
        return jalan != null;
    }
    
    public void check()
    {
        if(jalan())
        {
            y=0;
        }
        
        else if(jalan())
        {
            y=0;
        }
        
        else
        {
            down();
        }
    }
    
    public void tabrak()
    {
        if(isTouching(tong.class)){
            Greenfoot.setWorld(new gameover());
        }
    }
    
}
