import java.awt.Color;

public class Turtlelab
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(0,0,turtleWorld);
        turtle1.setPenColor(Color.RED);
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
        
        int x = 0;


        while (x<= 13)
        {   
 
                
            turtle1.turn(150);
            turtle1.forward(630);
            turtle1.turn(-300);
            turtle1.forward(630);
            x += 1;
            
            turtle2.turn(-150);
            turtle2.forward(630);
            turtle2.turn(300);
            turtle2.forward(630);
        
        
    }
}
}