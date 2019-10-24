package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    public static float divide(int num1, int num2){
        if(num2 == 0)
            return 0;
        else
            return num1/num2;
    }
}
