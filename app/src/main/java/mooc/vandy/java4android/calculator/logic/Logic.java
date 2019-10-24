package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;
import mooc.vandy.java4android.calculator.ui.MainActivity;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    float res;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        switch(operation) {
            case 1:
                res = Add.add(argumentOne, argumentTwo);
                break;
            case 2:
                res = Subtract.subtract(argumentOne, argumentTwo);
                break;
            case 3:
                res = Multiply.multiply(argumentOne, argumentTwo);
                break;
            case 4:
                res = Divide.divide(argumentOne, argumentTwo);
                break;
        }
        mOut.print(Float.toString(res));
    }
}
