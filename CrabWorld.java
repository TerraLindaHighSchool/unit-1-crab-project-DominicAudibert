import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(700, 700, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,372,228);
        Lobstering lobstering = new Lobstering();
        addObject(lobstering,120,115);
        for(int i = 0; i < 8; i++)
        {
            worming worming = new worming();
            int imageWidth = worming.getImage().getWidth();
            int imageHeight = worming.getImage().getHeight();
            int xpos = imageWidth + Greenfoot.getRandomNumber(getWidth() - 2 * imageWidth);
            int ypos = imageHeight + Greenfoot.getRandomNumber(getHeight() - 2 * imageHeight);
            addObject(worming,xpos,ypos);    
        }
        
        Lobstering lobstering2 = new Lobstering();
        addObject(lobstering2,314,69);
        
    }
}