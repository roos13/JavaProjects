import java.text.NumberFormat;

/**
 * Created by Rustam Borzov on 6/20/2017.
 * Book Class with code, title and Price
 */
public class Book {
    private String code;
    private String title;
    private double price;

    /**
     * Constructor
     * @param code
     * @param title
     * @param price
     */
    public Book(String code, String title, double price){
            this.code = code;
            this.title = title;
            this.price = price;

    }

    /**
     * Gets book's code
     */
    public String getCode(){ return this.code; }

    /**
     * Sets book's code
     * @param code
     */
    public void setCode(String code){ this.code = code; }

    /**
     * Gets book's title
     */
    public String getTitle(){ return this.title; }

    /**
     * Sets book's title
     */
    public void setTitle(String title){ this.title = title; }

    /**
     * Gets book's price
     */
    public String getPrice(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String formattedPrice = formatter.format(this.price);
        return formattedPrice; }

    /**
     * Sets book's price
     */
    public void setPrice(double price ) { this.price = price; }
}
