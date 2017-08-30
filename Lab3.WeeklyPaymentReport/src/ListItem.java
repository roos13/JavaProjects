import java.text.NumberFormat;

/**
 * Created by Rustam Borzov on 6/6/2017.
 * Describes an employee and computes his weekly salary
 */
public class ListItem {
    /**
     * Computes weekly salary for a salaried employee
     * @param anEmployee the Employee in the list
     * @return weekly salary
     */
    public static double computeSalaryForSalariedEmployee(Employee.SalariedEmployee anEmployee){
        double weeklySalary = anEmployee.getMonthlyRate()/4;                                //Suppose that every month equals to 4 weeks
        if (anEmployee.getBonus()){
            weeklySalary = weeklySalary*1.1;
        }
        return weeklySalary;
    }

    /**
     * Computes weekly salary for a hourly employee
     * @param anEmployee the Employee in the list
     * @return weekly salary
     */
    public static double computeSalaryForHourlyEmployee(Employee.HourlyEmployee anEmployee){
        double weeklySalary;
        if (anEmployee.getHoursWeek() <= 40){
            weeklySalary = anEmployee.getHourlyRate()*anEmployee.getHoursWeek();
        } else {
            weeklySalary = (40 * anEmployee.getHourlyRate() + (anEmployee.getHoursWeek() - 40) * 2 * anEmployee.getHourlyRate());
        }
        return weeklySalary;
    }

    /**
     * Computes weekly salary for a commissioned employee
     * @param anEmployee the Employee in the list
     * @return weekly salary
     */
    public static double computeSalaryForCommissionedEmployee(Employee.CommissionedEmployee anEmployee){
        double weeklySalary = anEmployee.getSales()*0.2;
        return weeklySalary;
    }

    /**
     * Formats list item
     * @param anEmployee the Employee in the list
     * @param weeklySalary computed weekly salary for this employee
     * @return the formatted list item
     */
    public static String formatSalaried(Employee.SalariedEmployee anEmployee, double weeklySalary){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String listItem = anEmployee.getEmployeeName() + " Salaried  " + formatter.format(weeklySalary);
        if (anEmployee.getBonus()){
            listItem = listItem + "*";
        }
        return listItem;
    }

    /**
     * Formats list item
     * @param anEmployee the Employee in the list
     * @param weeklySalary computed weekly salary for this employee
     * @return the formatted list item
     */
    public static String formatHourly(Employee.HourlyEmployee anEmployee, double weeklySalary){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String listItem = anEmployee.getEmployeeName() + " Hourly " + anEmployee.getHoursWeek() + " " + formatter.format(anEmployee.getHourlyRate()) + " " + formatter.format(weeklySalary);
        return listItem;
    }

    /**
     * Formats list item
     * @param anEmployee the Employee in the list
     * @param weeklySalary computed weekly salary for this employee
     * @return the formatted list item
     */
    public static String formatCommissioned(Employee.CommissionedEmployee anEmployee, double weeklySalary){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String listItem = anEmployee.getEmployeeName() + " Commissioned  " + formatter.format(anEmployee.getSales()) + " " + formatter.format(weeklySalary);
        return listItem;
    }

}
