import java.awt.Color;

public class Turtlelab
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(500,200,turtleWorld);
        turtle1.setPenColor(Color.RED);
        turtle1.penDown();
        turtle1.forward(20);
        
        
        
        Turtle turtle2 = new Turtle(490,210,turtleWorld);
        turtle2.setPenColor(Color.YELLOW);
        turtle2.penDown();                
        turtle2.forward(20);
        
        int x = 0;
        int pen = 10;
        int ang = 10;
        while (x <= 36)
        {
            turtle1.forward(pen);
//             turtle2.forward(pen);
            turtle1.turn(ang);
//             turtle2.turn(ang);
            x += 1;
//             pen += 3;
//             ang += 1;
         
        }
        
    }
}
