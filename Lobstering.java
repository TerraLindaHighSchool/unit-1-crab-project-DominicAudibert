import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobstering here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobstering extends Actor
{
    /**
     * Act - do whatever the Lobstering wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        turnAtEdge();
    }

    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(360));
        }
    }
}   
    
    
    
    
    
    
    
    