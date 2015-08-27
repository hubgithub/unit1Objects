import javax.swing.JOptionPane;
public class Dialogviewer
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("what is your name?");
           System.out.println("hello" + name);
    }
}