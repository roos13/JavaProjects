/**
 * Created by Rustam Borzov on 6/20/2017.
 * Class for file operations
 */

import java.io.*;

public class FileOperations {

    /**
     * Method to read text file
     * @param db - a book in the db
     * @throws IOException
     */

    public static void parseCSVFile(BookStore db) throws IOException {
        String lines ="";
        String array[] = null;
        String filePath = System.getProperty("user.dir");
        try {
            FileReader fr = new FileReader(filePath + "\\BookDB.txt");
            BufferedReader br = new BufferedReader(fr);
            while((lines= br.readLine())!= null){
                array =lines.split(",");
                db.addBook(new Book (array[0],array[1],Double.parseDouble(array[2])));
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");;
        }
    }

    /**
     * Method to write into the text File
     * @param bookDetails1 - array of book's requsites
     */
    public static void writeCSVFile(String[] bookDetails1){
        try {
            String[] books = bookDetails1;
            String content = " ";
            String filePath = System.getProperty("user.dir");
            FileWriter wr = new FileWriter((filePath + "\\BookDB.txt"),true);
            BufferedWriter writer = new BufferedWriter(wr);
            for(String item: books){
                content +=(item+",");
            }
            content = content.substring(1, content.length());

            writer.write(content);
            writer.newLine();
            writer.flush();
            writer.close();
        }catch (Exception e) {
            System.out.println("Problem reading file");
        }
    }

    /**
     * Method to erase the file
     */
    public static void eraseCSVFile(){
        try {
            String filePath = System.getProperty("user.dir");
            FileOutputStream fileOut1 = new FileOutputStream((filePath + "\\BookDB.txt"));
            fileOut1.close();
        }catch (Exception e) {
            System.out.println("Problem reading file");
        }
    }
}
