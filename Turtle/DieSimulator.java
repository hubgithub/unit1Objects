import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        //Option A
        Random generator = new Random();
        int dieValue = generator.nextInt(6); // returns [0,1,2,3,4,5] means six numbers
        dieValue += 1;
        System.out.println(dieValue);
        
        
        //Option B
        double dieValue2 = Math.random(); //returns[0,1)
        dieValue2 *= 6; //returns [0,6)
        dieValue2 += 1; //returns [1,7)
        System.out.println((int) dieValue2);
    }
}
        