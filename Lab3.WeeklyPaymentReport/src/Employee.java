/**
 * Created by Rustam Borzov on 6/6/2017.
 * Describes an employee with his class and parameters
 */
public class Employee {
    private String employeeName;
    private char employeeClass;

    /**
     * Constructor
     */
    public Employee(){
    }

    /**
     * Set employee name
     */
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    /**
     * Get employee name
     */
    public String getEmployeeName(){
        return this.employeeName;
    }

    /**
     * Set employee class
     */
    public void setEmployeeClass(char employeeClass){
        this.employeeClass = employeeClass;
    }

    /**
     * Get employee class
     */
    public char getEmployeeClass() {
        return employeeClass;
    }

    /**
     * Describes salaried employee
     */
    public static class SalariedEmployee extends Employee{
        private double monthlyRate;
        private boolean bonus;

        /**
         * Constructor
         */
        public SalariedEmployee(){
        }

        /**
         * Set salaried employee's monthly rate
         */
        public void setMonthlyRate(double monthlyRate) {
            this.monthlyRate = monthlyRate;
        }

        /**
         * Get salaried employee's monthly rate
         */
        public double getMonthlyRate() {
            return monthlyRate;
        }

        /**
         * Set salaried employee's bonus
         */
        public void setBonus(boolean bonus){
            this.bonus = bonus;
        }

        /**
         * Get salaried employee's bonus
         */
        public boolean getBonus(){
            return bonus;
        }
    }

    /**
     * Describes hourly employee
     */
    public static class HourlyEmployee extends Employee{
        private int hoursWeek;
        private double hourlyRate;

        /**
         * Constructor
         */
        public HourlyEmployee(){
        }

        /**
         * Set hourly employee's hours in week
         */
        public void setHoursWeek(int hoursWeek) {
            this.hoursWeek = hoursWeek;
        }

        /**
         * Get hourly employee's hours in week
         */
        public int getHoursWeek() {
            return hoursWeek;
        }

        /**
         * Set hourly employee's hourly rate
         */
        public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

        /**
         * Get hourly employee's hourly rate
         */
        public double getHourlyRate() {
            return hourlyRate;
        }
    }

    /**
     * Describes commissioned employee
     */
    public static class CommissionedEmployee extends Employee{
        private double sales;

        /**
         * Constructor
         */
        public CommissionedEmployee(){
        }

        /**
         * Set commissioned employee's sales
         */
        public void setSales(double sales) {
            this.sales = sales;
        }

        /**
         * Get commissioned employee's sales
         */
        public double getSales() {
            return sales;
        }
    }
}
