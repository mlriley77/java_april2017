package com.gc.library.dao;

import com.gc.library.dto.LibraryItemDto;

import java.util.ArrayList;

/**
 * Created by maurice on 5/10/17.
 * Handles all CRUD operations
 */
public interface Dao {
    //return all items from from DB
    ArrayList<LibraryItemDto> getLibraryItemList();

    //return all items by the given author
    ArrayList<LibraryItemDto> getLibraryItemByAuthor(String author);

    //return all items with the given title
    ArrayList<LibraryItemDto> getLibraryItemByTitle(String titleKeyWord);

    //return the item by item id
    LibraryItemDto getLibraryItemById(int itemId);

    //change the status of a library item
    void checkOutBook(int itemId, boolean b, int returnDayOffSet);

    //insert a new library item into DB
    void addItem(LibraryItemDto item);
}
