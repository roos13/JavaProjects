import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by Rustam Borzov on 6/6/2017.
 * Computes total salary for all employees
 */
public class Total {
    static double total = 0;

    /**
     * Computes a sum of weekly salaries
     * @param weeklyRates list of the all salaries
     * @return total
     */
    public static double getTotal(ArrayList<Double> weeklyRates){
        for (Double d : weeklyRates
             ) {
                total += d;
        }
        return total;
    }

    /**
     * Formats total line
     * @param total is sum of all slaries
     * @return formatted total
     */
    public static String formatTotal(double total){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String totalLine = "TOTAL: " + formatter.format(total);
        return totalLine;
    }
}
