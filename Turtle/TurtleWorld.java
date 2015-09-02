import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(0,0,turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        int y = 1;
        while (y < 888)
        {
            turtle.backward(10);
            turtle.turn(1);
            Thread.sleep(1);
            y += 1;
        }
    }
}
