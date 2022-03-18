import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();

        for(int x = 50; x < 600; x+= WIDTH_WALL)
        {
            wall = new Wall();
            addObject(wall,x,30);
            wall = new Wall();
            addObject(wall,x,350);
        }
        for(int y = 58; y < 200; y+= HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,50,y);
            wall = new Wall();
            addObject(wall,565,y);
        }


        SmallBall smallBall = new SmallBall();
        addObject(smallBall,265,165);
        BigBall bigBall = new BigBall();
        addObject(bigBall,164,168);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,52,244);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,202,220);
        BigBall bigBall4 = new BigBall();
        addObject(bigBall4,387,175);
        BigBall bigBall5 = new BigBall();
        addObject(bigBall5,387,92);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,264,132);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,267,86);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,285,195);
        smallBall4.setLocation(283,194);
        smallBall4.setLocation(283,194);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,333,164);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,268,266);

        Banana banana = new Banana();
        addObject(banana,144,262);

        Cherry cherry = new Cherry();
        addObject(cherry,332,240);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,394,212);
        cherry2.setLocation(417,236);
        cherry2.setLocation(420,243);
        cherry2.setLocation(420,243);
        Cherry cherry3 = new Cherry();
        addObject(cherry3,462,112);
        SmallBall smallBall7 = new SmallBall();
        addObject(smallBall7,485,169);
        SmallBall smallBall8 = new SmallBall();
        addObject(smallBall8,494,85);
        SmallBall smallBall9 = new SmallBall();
        addObject(smallBall9,496,212);
        Strowberry strowberry = new Strowberry();
        addObject(strowberry,524,256);
        SmallBall smallBall10 = new SmallBall();
        addObject(smallBall10,448,264);
        SmallBall smallBall11 = new SmallBall();
        addObject(smallBall11,392,290);

        Ballon ballon = new Ballon();
        addObject(ballon,212,276);

        PacmanHud hud = new PacmanHud();
        addObject(hud,0,0);

        Pacman pacman = new Pacman(hud);
        addObject(pacman,110,90);
    }
}
