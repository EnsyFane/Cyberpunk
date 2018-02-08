import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class SondajA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SondajA extends Raspunsuri
{
    private int x,y;
    int s=StartScreen.getRez();
    public SondajA()
    {
        this(302,37);

    }

    public SondajA(int lungime , int inaltime)
    {
        GreenfootImage image = getImage();
        image.scale(lungime*s/3,inaltime*s/3);
        setImage(image);    
        x=lungime*s/3;
        y=inaltime*s/3;
    }

    public void act() 
    {
        // Add your action code here.
        CheckMouseOver();
        CheckClick();
    }

    public void CheckMouseOver()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        //Change Button.class to the name of your button class.
        if (mouse != null) {
            //change the file to what you want for when the mouse is not over the button.
            setImage("SA.png");
            GreenfootImage image = getImage();
            image.scale(x,y);
            setImage(image);   
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), SondajA.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    //change the file to what you want for when the mouse is over the button.
                    setImage("SAin.png");
                    image = getImage();
                    image.scale(x,y);
                    setImage(image);   
                }
            }
        }
    }

    public void CheckClick()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))
        {
            Sunete.Ok();
            Actor actor = getWorld().getObjects(Snd.class).get(0);
            int x=actor.getX(),y=actor.getY();
            if(!Snd.getK())
            {
                getWorld().addObject(new ViataPickup(20,20),x+60*s/3,y);
                getWorld().addObject(new ViataPickup(20,20),x+90*s/3,y);
            }

            Snd.setK(true);

        }
    }

}