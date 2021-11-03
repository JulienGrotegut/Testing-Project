import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        
        Robot r1 = new Robot(20, 400, "Bob");
        
        addObject(r1, 100, 100);
    }
}
