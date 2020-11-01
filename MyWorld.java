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
        super(1000, 500, 1); 
        
       // addObject(new Frog(), 30, 300);
        Ant Leal = new Ant("Leal",4);
        addObject(Leal, 50, 100);
        
      //  addObject(new Ant("Lois", 6),50,300);
        //addObject(new Kupu("Rani", 8), 50, 200);
        
        for(int i=0; i<=20; i++){
        addObject(new Bread(), Greenfoot.getRandomNumber(950), Greenfoot.getRandomNumber(450));
    }
    
    for(int i=0; i<7; i++){
        addObject(new Frog(), Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(300));
    }
}
}
