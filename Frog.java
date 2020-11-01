import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    
    
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+1, getY());
        if(getX()==999){
            setLocation(0,getY());
            setRotation(10);
            
        }
        move(1);
        turn(2);
        
        }
        // Add your action code here.
        
}
