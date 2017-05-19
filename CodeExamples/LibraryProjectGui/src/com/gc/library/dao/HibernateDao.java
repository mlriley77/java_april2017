package com.gc.library.dao;

import com.gc.library.dto.LibraryItemDto;

import java.util.ArrayList;

/**
 * Created by maurice on 5/10/17.
 */
public class HibernateDao implements Dao {
    @Override
    public ArrayList<LibraryItemDto> getLibraryItemList() {
        //TODO add getLibraryItemList code
        return null;
    }

    @Override
    public ArrayList<LibraryItemDto> getLibraryItemByAuthor(String author) {
        //TODO add getLibraryItemByAuthor code
        return null;
    }

    @Override
    public ArrayList<LibraryItemDto> getLibraryItemByTitle(String titleKeyWord) {
        //TODO add getLibraryItemByTitle code
        return null;
    }

    @Override
    public LibraryItemDto getLibraryItemById(int itemId) {
        //TODO add getLibraryItemById code
        return null;
    }

    @Override
    public void checkOutBook(int itemId, boolean b, int returnDayOffSet) {
        //TODO add checkOutBook code
    }

    @Override
    public void addItem(LibraryItemDto item) {
        //TODO add addItem code
    }
}
