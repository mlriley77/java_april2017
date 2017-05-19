package com.gc.library.gui;

import com.gc.library.dto.BookDto;
import com.gc.library.dto.LibraryItemDto;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by maurice on 5/2/17.
 * Html ref: http://codepen.io/secondfret/pen/tgBCI
 */
public class ItemRender extends JLabel implements ListCellRenderer<LibraryItemDto> {
    @Override
    public Component getListCellRendererComponent(JList<? extends LibraryItemDto> list, LibraryItemDto libraryItem, int index, boolean isSelected, boolean cellHasFocus) {

        String title = ((BookDto)libraryItem).getTitle();
        String author = ((BookDto)libraryItem).getAuthor();

        String rowHtml = "<html><ul  style=\"list-style-type: none;\">\n" +
                "<li>\n" +
                "<h3>" + title + "</h3>\n" +
                "<p><strong>Author: </strong>" + author + "<br><strong>Status: </strong>" + libraryItem.isStatus() + "<br><strong>Due Date: </strong>" + libraryItem .getDueDate() + "</p>\n" +
                "</li>\n" +
                "</ul></html>";

        setText(rowHtml);

        try {
            ImageIcon icon = new ImageIcon(new URL(libraryItem.getThumbURL()));
            icon =  new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            setIcon(icon);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return this;
    }
}
