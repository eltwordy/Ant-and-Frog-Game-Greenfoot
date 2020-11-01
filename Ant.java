import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ant extends Actor
{
    int a, umur;
    String nama;
    
    
    public Ant(String namasemut, int umursemut){
        umur = umursemut;
        nama = namasemut;
    }
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
         makan();
         move(1);
         
        
        if(nama == "Leal" && umur == 4){
            if(Greenfoot.isKeyDown("Left")){
                turn(-3);
            }
                else if(Greenfoot.isKeyDown("Right")){
                turn(3);
                
                }
        }
        
       // if(nama == "Lois" && umur == 6){
         //   if(Greenfoot.isKeyDown("F")){
         //       turn(5);
         //   }
                   
        //}
        
        //Jika Bertabrakan dengan musuh
        if(isTouching(Frog.class)){
          getWorld().showText("Game Over", 500, 250);
          Greenfoot.stop();
          Greenfoot.playSound("lose.wav");
        }else if(getX()==999 || getX()==0){
          getWorld().showText("Game Over", 500, 250);
          Greenfoot.stop();
          Greenfoot.playSound("lose.wav");
        }else if(getY()==499 || getY()==0){
          getWorld().showText("Game Over", 500, 250);
          Greenfoot.stop();
          Greenfoot.playSound("lose.wav");
        }
    }    
    
    //Makan
    private void makan(){
        if(isTouching(Bread.class)){
            removeTouching(Bread.class);
            a = a + 100;
            getWorld().showText("Score: "+a, 500, 50);
            Greenfoot.playSound("eat.wav");
        }
        if(a == 15000){
            getWorld().showText("Anda Menang", 500, 250);
            Greenfoot.stop();
            Greenfoot.playSound("applause.wav");

        }
    }
    
}
