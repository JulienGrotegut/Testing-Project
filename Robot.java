import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Robot extends Actor
{
    private int speed;
    private int batteryLevel;
    private String name;
    private int moveCounter;
    private boolean moving = true;
    public Robot(int speed, int batteryLevel, String name){
           this.speed=speed;
           this.batteryLevel=batteryLevel;
           this.name=name;
    }
    public String toString(){
        return("Name: " + name + "\n" + "Speed: " + speed + "\n" + "Battery-Level: " + batteryLevel);
    }
    public void act(){
        if(moving==true){
            move(speed);
            moveCounter+=1;
        }
        else if(moving==false){
            move(0);
        }
        if(moveCounter%3 == 0 && moving==true){
            batteryLevel -=1;
        }
        if(batteryLevel==0){
            moving=false;
        }
        if(isAtEdge()){          
            turn(180);
            move(1);
            turn(-90);
        }
        getWorld().showText(toString(), 300, 300);
        System.out.println(batteryLevel);
    } 
}
