import java.awt.Color;

public class Turtlelab
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(0,0,turtleWorld);
        turtle1.setPenColor(Color.PINK);
        turtle1.setBodyColor(Color.cyan);
        turtle1.penDown();
        turtle1.setPenWidth(5);

        Turtle turtle2 = new Turtle(630,520,turtleWorld);
        turtle2.setPenColor(Color.YELLOW);
        turtle2.setBodyColor(Color.red);
        turtle2.penDown();
        turtle2.setPenWidth(5);

        
        Turtle turtle3 = new Turtle(0,210,turtleWorld);
        turtle3.setPenColor(Color.GREEN);
        turtle3.setBodyColor(Color.green);
        turtle3.penDown();
        turtle3.setPenWidth(5);
        
        Turtle turtle4 = new Turtle(0,210,turtleWorld);
        turtle4.setPenColor(Color.black);
        turtle4.setBodyColor(Color.black);
        turtle4.penDown();
        turtle4.setPenWidth(5);
        
        Turtle turtle5 = new Turtle(320,250,turtleWorld);
        turtle5.setPenColor(Color.YELLOW);
        turtle5.setBodyColor(Color.RED);
        turtle5.penDown();
        turtle5.setPenWidth(3);
        
        int x = 0;


        while (x<= 13)
        {   
            turtle1.turn(147);
            turtle1.forward(630);
            turtle1.turn(-300);
            turtle1.forward(630);
            x += 1;
            
            turtle2.turn(-153);
            turtle2.forward(630);
            turtle2.turn(300);
            turtle2.forward(630);
            
            turtle3.turn(142);
            turtle3.forward(630);
            turtle3.turn(-300);
            turtle3.forward(630);
            
            turtle4.turn(150);
            turtle4.forward(630);
            turtle4.turn(-300);
            turtle4.forward(630);

            Thread.sleep(500);
            
    }
    
    int num = 0;
    int movx = 2;
    while (num <= 330)
    {
        turtle5.forward(movx);
        turtle5.turnLeft();
        if (num >= 50)
        {
            turtle5.setPenColor(Color.CYAN);
        }
        
        if (num >= 100)
        {
            turtle5.setPenColor(Color.YELLOW);
        }
        
        if (num >= 150)
        {
            turtle5.setPenColor(Color.MAGENTA);
        }
        if (num >= 200)
        {
            turtle5.setPenColor(Color.ORANGE);
        }
        if (num >= 250)
        {
            turtle5.setPenColor(Color.BLUE);
        }
        movx += 2;
        num += 1;
        Thread.sleep(20);
    }

    
}
}
