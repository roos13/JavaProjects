/**
 * Created by Rustam Borzov on 6/20/2017.
 * Class for store books and operations over them
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BookStore {
    List<Book> book1 = new ArrayList<>();
    ListIterator<Book> iterator = book1.listIterator();

    /**
     * Adds book
     * @param book
     */
    public void addBook(Book book){
        iterator.add(book);
    }

    /**
     * Adds NEW book
     */
    public void addNewBook(){
        while (iterator.hasNext()){
            iterator.next();
        }
    }

    /**
     * Gets first book
     */
    public int firstBook(){
        while(iterator.hasPrevious()){
            iterator.previous();
        }
        int firstIndex = iterator.nextIndex();
        return (firstIndex);
    }

    /**
     * Gets last book
     */
    public int lastBook(){
        while(iterator.hasNext()){
            iterator.next();
        }
        int lastIndex =  iterator.previousIndex();
        iterator.previous();
        return(lastIndex );
    }

    /**
     * Gets next book
     */
    public int nextBook(){
        while(iterator.hasNext()&& (iterator.nextIndex()< book1.size()-1)){
            iterator.next();

            return (iterator.nextIndex());
        }
        return (firstBook());
    }

    /**
     * Gets previous book
     */
    public int prevBook(){
        int prevIndex = iterator.previousIndex();
        while(iterator.hasPrevious()&& (prevIndex> 0)){
            iterator.previous();

            return (prevIndex);
        }
        if (prevIndex == 0){
            return(firstBook());
        }

        return (lastBook());
    }

    /**
     * Deletes a book
     */
    public int  deleteBook(){
        if(!iterator.hasPrevious()){
            iterator.remove();
        }
        else{
            iterator.next();
            iterator.remove();
        }
        return iterator.nextIndex();
    }

    /**
     * Updates a book
     */
    public int updateBook(){
        return iterator.nextIndex();
    }

    /**
     * Get the next List Iterator index
     */

    public int nextIndex(){
        iterator.next();
        return(iterator.nextIndex());
    }
}
