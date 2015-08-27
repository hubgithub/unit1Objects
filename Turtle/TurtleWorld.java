import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(0,0,turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        int y = 1;
        while (y < 88888)
        {
            turtle.backward(2);
            turtle.turn(1);
            y += 1;
        }
    }
}
