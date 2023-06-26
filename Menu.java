import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public Menu()
    {    
        super(500, 600, 1); 
        if(this.getClass().getName().equalsIgnoreCase("MainMenu")){
            ExitButton exit = new ExitButton();
            addObject(exit,361,270);
            PlayButton play = new PlayButton();
            addObject(play,141,270);
            BackstoryButton backstory = new BackstoryButton();
            addObject(backstory, 250,350);
                 
        } else {
            MainMenuButton mainmenu = new MainMenuButton();
            addObject (mainmenu,250,410);
            GreenfootImage image = mainmenu.getImage();
            image.scale(image.getWidth()*3/2, image.getHeight()*3/2);
            
            TitleGame title = new TitleGame();
            addObject (title,250,200);
            GreenfootImage image2 = title.getImage();
            image2.scale(image2.getWidth()*2, image2.getHeight()*2);
            
            showText ("KELOMPOK 2: ", 80, 520);
            showText ("\n1. Sekar Gesti Amalia Utami (M0521071)", 190, 530);
            showText ("\n2. Andreas Domenico Situmorang (M0521083)",220, 550);
        }
    
    }
    
}
