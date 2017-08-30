/**
 * Created by Rustam Borzov on 6/20/2017.
 */

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.Serializable;


public class BookMain extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form BookMain
     */

    int indexValue=0;
    BookStore db = new BookStore();
    boolean newBook = false;   // while adding new Book, set as true

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel bookCodeLabel;
    private javax.swing.JTextField bookCodeText;
    private javax.swing.JLabel bookPriceLabel;
    private javax.swing.JTextField bookPriceText;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JTextField bookTitleText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton lastButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    public BookMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bookCodeText = new javax.swing.JTextField();
        bookCodeLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        bookTitleText = new javax.swing.JTextField();
        bookPriceLabel = new javax.swing.JLabel();
        bookPriceText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        lastButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Maintenance");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        bookCodeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookCodeTextFocusGained(evt);
            }
        });
        bookCodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCodeTextActionPerformed(evt);
            }
        });
        bookCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookCodeTextKeyPressed(evt);
            }
        });

        bookCodeLabel.setText("CODE:");

        bookTitleLabel.setText("TITLE:");

        bookTitleText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookTitleTextFocusGained(evt);
            }
        });
        bookTitleText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookTitleTextKeyPressed(evt);
            }
        });

        bookPriceLabel.setText("PRICE:");

        bookPriceText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookPriceTextFocusGained(evt);
            }
        });
        bookPriceText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookPriceTextKeyPressed(evt);
            }
        });

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        firstButton.setText("FIRST");
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });

        lastButton.setText("LAST");
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonActionPerformed(evt);
            }
        });

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("PREV");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bookCodeLabel)
                                                        .addComponent(bookTitleLabel)
                                                        .addComponent(bookPriceLabel))
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bookCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bookTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bookPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(addButton)
                                                        .addComponent(firstButton))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(updateButton)
                                                        .addComponent(lastButton))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(deleteButton)
                                                        .addComponent(nextButton))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(prevButton)
                                                        .addComponent(exitButton))))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bookCodeLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookTitleLabel)
                                        .addComponent(bookTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookPriceLabel)
                                        .addComponent(bookPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addButton)
                                        .addComponent(updateButton)
                                        .addComponent(deleteButton)
                                        .addComponent(exitButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstButton)
                                        .addComponent(lastButton)
                                        .addComponent(nextButton)
                                        .addComponent(prevButton))
                                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookCodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCodeTextActionPerformed
    }//GEN-LAST:event_bookCodeTextActionPerformed

    private void bookCodeTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookCodeTextFocusGained

    }//GEN-LAST:event_bookCodeTextFocusGained

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //When Form is shown, all buttons except "UPDATE" buttons are enabled
        enableButtons(true);
        indexValue = db.firstBook();
        //When the Form is shown, the first data is displayed
        bookCodeText.setText(String.valueOf (db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
    }//GEN-LAST:event_formComponentShown

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed

        //Display the first item of the list
        indexValue = db.firstBook();
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
    }//GEN-LAST:event_firstButtonActionPerformed

    private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
        //Display the last item of the list
        indexValue = db.lastBook();
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
    }//GEN-LAST:event_lastButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        //Display the next Button
        indexValue = db.nextBook();
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
    }//GEN-LAST:event_nextButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //Clears all the text fields and enables update button
        enableButtons(false);
        bookCodeText.setText(" ");
        bookTitleText.setText(" ");
        bookPriceText.setText(" ");

        //New book record needs to be entered
        newBook = true;

        // To add the book at the end of the BookDB list
        db.addNewBook();

    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        //Checks if this action is for adding new book and adds new book
        if(newBook){
            //Writes the new Book into text file
            FileOperations.writeCSVFile(new String[]{bookCodeText.getText(),bookTitleText.getText(),bookPriceText.getText()});
            //add the new book to book object
            db.addBook(new Book(bookCodeText.getText(),bookTitleText.getText(),Double.parseDouble(bookPriceText.getText()) ));
            System.out.println("A new book has been added");
            newBook = false;
        }

        //If this action is for updating the existing file, updates the existing file
        else{
            System.out.println("The record has been updated");
            String bookid = bookCodeText.getText();
            for(int i =0; i <db.book1.size();i++){
                if (bookid.equals(db.book1.get(i).getCode()) ){
                    db.book1.get(i).setTitle(bookTitleText.getText());
                    db.book1.get(i).setPrice(Double.parseDouble(bookPriceText.getText()));
                }
            }

            //Erases the existing file and rewrites the file with updated data
            FileOperations.eraseCSVFile();
            for(int i =0; i <db.book1.size();i++){
                FileOperations.writeCSVFile(new String[]{db.book1.get(i).getCode(), db.book1.get(i).getTitle(),String.valueOf(db.book1.get(i).getPrice())});
            }
        }

        //Display the last item of the list
        indexValue = db.lastBook();
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        enableButtons(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        //Deletes the current book  record
        indexValue = db.deleteBook();
        //clears the textfields
        bookCodeText.setText(" ");
        bookTitleText.setText(" ");
        bookPriceText.setText(" ");

        //Displays the next record
        if (indexValue != db.lastBook()){
            indexValue = db.firstBook();
            bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
            bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
            bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        }
        else{
            bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
            bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
            bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        }
        //Erases the existing file and rewrites it
        FileOperations.eraseCSVFile();
        for(int i =0; i <db.book1.size();i++){
            FileOperations.writeCSVFile(new String[]{db.book1.get(i).getCode(), db.book1.get(i).getTitle(),String.valueOf(db.book1.get(i).getPrice())});
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void bookTitleTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookTitleTextFocusGained
        //UPDATE button is enabled
        enableButtons(false);
    }//GEN-LAST:event_bookTitleTextFocusGained

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //Exits from the program
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        //Shows the previous books details
        indexValue = db.prevBook();
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        System.out.println(System.getProperty("user.dir"));
    }//GEN-LAST:event_prevButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

    private void bookCodeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookCodeTextKeyPressed
    }//GEN-LAST:event_bookCodeTextKeyPressed

    private void bookTitleTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTitleTextKeyPressed
        //Escape Sequence key pressed
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ESCAPE){
            enableButtons(true);
            indexValue = db.nextBook();
            bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
            bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
            bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
            bookCodeText.requestFocus();
        }
    }//GEN-LAST:event_bookTitleTextKeyPressed

    private void bookPriceTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookPriceTextKeyPressed
        //Escape Sequence key pressed
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ESCAPE){
            enableButtons(true);
            indexValue = db.nextBook();
            bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
            bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
            bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
            bookCodeText.requestFocus();
        }
    }//GEN-LAST:event_bookPriceTextKeyPressed

    private void bookPriceTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookPriceTextFocusGained
        // To update the new Book
        enableButtons(false);
    }//GEN-LAST:event_bookPriceTextFocusGained

    //Button visibility control function
    public void enableButtons(boolean flag){
        boolean flag2 = false;
        if (!flag)
            flag2 = true;
        updateButton.setEnabled(flag2);
        addButton.setEnabled(flag);
        deleteButton.setEnabled(flag);
        lastButton.setEnabled(flag);
        nextButton.setEnabled(flag);
        firstButton.setEnabled(flag);
        prevButton.setEnabled(flag);
}

    public static void main(String args[]) throws IOException {
        BookMain bookMain = new BookMain();
        FileOperations.parseCSVFile(bookMain.db);


        /**
         *  Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                bookMain.setVisible(true);
            }
        });
    }
}
