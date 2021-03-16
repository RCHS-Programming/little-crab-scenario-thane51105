import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move(5);
        lookForWorm();
        randomTurn();
        turnAtEdge();
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
        }
    }
    
    /*
     * make the crab turn randomly left or right between 0 and 45 degrees
     */
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn( Greenfoot.getRandomNumber(91) - 45);
        }
    }
    
    public void turnAtEdge()
    {
        if(isAtEdge())
       {
           turn(17);
        }
    }
        
}


