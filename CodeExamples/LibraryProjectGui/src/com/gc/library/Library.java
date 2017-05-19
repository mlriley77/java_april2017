package com.gc.library;

import com.gc.library.dao.Dao;
import com.gc.library.dto.LibraryItemDto;
import com.gc.library.factory.DaoFactory;

import java.util.ArrayList;

/**
 * Created by maurice on 4/30/17.
 */
public class Library {
    private static final int DUE_DATE_OFFSET = 7;
    private ArrayList<LibraryItemDto> bookList;

    /*
    * Default constructor
     */
    public Library() {
        this.bookList = readBooks();
    }

    /*
    * Intializes bookList from file, hardcoded, URL or database etc...
     */
    private ArrayList<LibraryItemDto> readBooks() {

        Dao dao = DaoFactory.getInstance(DaoFactory.JDBC);
        ArrayList<LibraryItemDto> tempList = dao.getLibraryItemList();

        return  tempList;
    }

    /*
    * Get arraylist of book objects
     */
    public ArrayList<LibraryItemDto> getBookList() {

        bookList = readBooks();
        return bookList;
    }

    /*
    * Return current list of books in this library as a string including index numbers
     */
    public String getBookListAsString() {
        getBookList();
        StringBuffer buff = new StringBuffer();
        int index = 1;
        for(LibraryItemDto book: this.bookList){
            buff.append(index + ". \n" + book + "\n");
            index++;
        }
        return buff.toString();
    }

    /*
    * Return book objects for specified author name
     */
    public ArrayList<LibraryItemDto> searchByAuthor(String author) {

        Dao dao = DaoFactory.getInstance(DaoFactory.JDBC);
        ArrayList<LibraryItemDto> searchResults = dao.getLibraryItemByAuthor(author);

        return searchResults;
    }

    /*
    * Return book objects for specified title keyword
    */
    public ArrayList<LibraryItemDto> searchByTitleKeyWord(String titleKeyWord) {

        Dao dao = DaoFactory.getInstance(DaoFactory.JDBC);
        ArrayList<LibraryItemDto> searchResults = dao.getLibraryItemByTitle(titleKeyWord);
        return searchResults;
    }

    /*
    * Change the status of the selected book to checkedOut and calculate the due date
    * false = checked in, true = checked out
     */
    public void checkOutBook(int itemId) {

        Dao dao = DaoFactory.getInstance(DaoFactory.JDBC);
        LibraryItemDto book = dao.getLibraryItemById(itemId);
        if(book.isStatus() == false) {//only allow checkout for items with a status of false (=checked in)
            dao.checkOutBook(itemId, true, DUE_DATE_OFFSET);
        }
    }

    /*
    * Change the status of the selected book to checkedIn and reset due date
    * false = checked in, true = checked out
     */
    public void checkInBook(int itemId) {

        Dao dao = DaoFactory.getInstance(DaoFactory.JDBC);
        LibraryItemDto book = dao.getLibraryItemById(itemId);
        if(book.isStatus() == true) {//only allow checkin for items with a status of true (=checked out)
            dao.checkOutBook(itemId, false, -1);
        }
    }

    /*
    * add book to library book list.
    * This could be a save to file code or save to database code.
     * For now we are using an arraylist to temporarily persist our book data
     */
    public void addBook(LibraryItemDto item) {
        Dao dao = DaoFactory.getInstance(DaoFactory.JDBC);
        dao.addItem(item);
    }
}
