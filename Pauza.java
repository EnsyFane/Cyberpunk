import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class Pauza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pauza extends Actor
{
    /**
     * Act - do whatever the Pauza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int s=Nivele.getRez();
    
    public Pauza()
    {
        this(100,100);
    }
    
    public Pauza(int lungime, int inaltime)
    {
        s=Nivele.getRez();
        GreenfootImage image = getImage();
        image.scale(lungime*s/3,inaltime*s/3);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
