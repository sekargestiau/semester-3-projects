import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundSpace extends World
{

    private int interlude = 0;
    private int score;
    private int healthpoint = 5;
    public GreenfootSound music = new GreenfootSound("sfx.mp3");
    private static final String bgImageName = "background.jpg";
    private static final double scrollSpeed = 2.5;
    private static final int picHeight = (new GreenfootImage(bgImageName)).getHeight();
    private int LEVEL = 6;
    private int player = 1; 
    
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BackgroundSpace()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picHeight, getWidth());
        bgBase.drawImage(bgImage, 0, 0);
        showHP();
        showScore();
        
        //addObject (new Airplane(),200,550);
        addObject (new Airplane2(),300,550);
        music.play();
        prepare();
    }

    public void updateHP(int point){
        healthpoint = healthpoint + point;
        showHP();

        if(healthpoint == 0){
            Greenfoot.delay(10);
            addObject(new YouLose(),250,300);
            Greenfoot.delay(50);
            music.stop();
            Greenfoot.setWorld(new MainMenu());
        }
    }

    public void showHP(){
        showText("HP : "+healthpoint, 400, 25);
    }

    public void addScore (int points){
        score = score + points;
        showScore();
        /*if(score == 200){
            Greenfoot.delay(10);
            addObject(new YouWin(),250,300);
            Greenfoot.delay(50);
            music.stop();
            Greenfoot.setWorld(new MainMenu());
        }*/
        if(score == 200 && LEVEL == 1){
            //Greenfoot.delay(10);
            //addObject(new YouWin(),250,300);
            //Greenfoot.delay(200);
            LEVEL++;
            //music.stop();
            //Greenfoot.setWorld(new MainMenu());
            }
            
            if(score == 500 && LEVEL == 2){
            Greenfoot.delay(10);
            LEVEL++;
            //music.stop();
            //Greenfoot.setWorld(new MainMenu());
            }
            
            if(score == 1000 && LEVEL == 3){
            Greenfoot.delay(10);
            LEVEL++;
            //music.stop();
            //Greenfoot.setWorld(new MainMenu());
            }
            
            if(score == 1500 && LEVEL == 4){
            Greenfoot.delay(10);
            LEVEL++;
            //music.stop();
            //Greenfoot.setWorld(new MainMenu());
            }
            
            if(score == 2000 && LEVEL == 5){
            Greenfoot.delay(10);
            LEVEL++;
            music.stop();
            }
            
            if(score == 2500 && LEVEL == 6){
            Greenfoot.delay(10);
            music.stop();
            addObject(new YouWin(),250,300);
             Greenfoot.delay(100);
             Greenfoot.setWorld(new Ending1());
            }
    }

    private void showScore(){
        showText ("SCORE : "+score, 100, 25);
        showText ("LEVEL :"+LEVEL, 250, 25);
    }
    
    public void act(){
        /*if (Greenfoot.getRandomNumber (100) < 3){
            addObject(new Enemy(), Greenfoot.getRandomNumber(599), 500);
        }
        if (Greenfoot.getRandomNumber (100) < 1){
            addObject(new Shield(),Greenfoot.getRandomNumber(599), 500);
        }*/
        if(LEVEL == 1) {
            if (Greenfoot.getRandomNumber (400) < 3){
                addObject(new Enemy(), Greenfoot.getRandomNumber(599), 500);
            }
        }
        
        if(LEVEL == 2) {
            if (Greenfoot.getRandomNumber (500) < 4){
                addObject(new Enemy(), Greenfoot.getRandomNumber(599), 500);
                addObject(new Asteroid(), Greenfoot.getRandomNumber(599), 500);
            }
        }
        
        if(LEVEL == 3) {
            if (Greenfoot.getRandomNumber (500) < 5){
                addObject(new Enemy(), Greenfoot.getRandomNumber(599), 500);
                addObject(new Enemy2(), Greenfoot.getRandomNumber(599), 500);
                addObject(new Asteroid(), Greenfoot.getRandomNumber(599), 500);
            }
        }
        
        if(LEVEL == 4) {
            if (Greenfoot.getRandomNumber (400) < 5){
                addObject(new Enemy(), Greenfoot.getRandomNumber(599), 500);
                addObject(new Enemy2(), Greenfoot.getRandomNumber(599), 500);
                addObject(new Asteroid(), Greenfoot.getRandomNumber(599), 500);
            }
        }
        
        if(LEVEL == 5) {
            if (Greenfoot.getRandomNumber (400) < 6){
                addObject(new Enemy(), Greenfoot.getRandomNumber(599), 500);
                addObject(new Enemy2(), Greenfoot.getRandomNumber(599), 500);
                addObject(new Asteroid(), Greenfoot.getRandomNumber(599), 500);
            }
        }
        
        if(LEVEL == 6) {
            addObject(new BossEnemy(), 300, 100); 
        }
        
        if (Greenfoot.getRandomNumber (300) < 1){
            addObject(new Heart(),Greenfoot.getRandomNumber(599), 500);
        }
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picHeight) scrollPosition += picHeight;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picHeight;
        paint(scrollPosition);
        
        
    }
    
    private void paint(int position){
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, 0, position + picHeight);
        bg.drawImage(bgImage, 0, position );
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(){
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picHeight, getWidth());
        bgBase.drawImage(bgImage, 0, 0);
        showHP();
        showScore();
        addObject (new Airplane(),250,550);
        music.play();
    }
}
