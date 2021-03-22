import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage (image1);
    }
    
    public void act()
    {
        move(5);
        lookForWorm();
        turnCrab();
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * check if crab touched worm, if it did eat, if not do nothing
     */
    public void lookForWorm()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound ("slurp.wav");
        }
    }
    
   /*
    * check if a user has pressed key, if so turn crab
    */
   public void turnCrab()
   {
               if (Greenfoot. isKeyDown("a"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(5);
        }
    }
}


