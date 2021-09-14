import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
         move(5);
         turnAtEdge();
         checkKeyPress();
         onCollision();
    }
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
        turn(50);
        }
    }
    
    private void checkKeyPress()
        {
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn (-5);
        }
        
    }
        private void onCollision()
    {
        if(isTouching(worming.class))
        {
            removeTouching(worming.class);
            Greenfoot.playSound("papercrumple.wav.wav");
        }
        if(getWorld().getObjects(worming.class).size() == 0)
        {
            Greenfoot.setWorld(new WinSplash());
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
        
 
        
        if(isTouching(Lobstering.class))
        {
            
            Greenfoot.playSound("au.wav"); 
            Greenfoot.stop();
        }
    }
        
    
   
    
    
    
    
    
    
}


