import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) thane hudelson
 * @version (a version number or a date)3/16/21
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        lookForCrab();
        randomTurn();
        turnAtEdge();
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * check if lobster touched crab, if it did eat, if not do nothing
     */
    public void lookForCrab()
    {
        if(isTouching(Crab.class))
        {
            removeTouching(Crab.class);
            Greenfoot.playSound ("au.wav");
            Greenfoot.stop();
        }
    }
    
    /*
     * make the lobster turn randomly left or right between 0 and 45 degrees
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
