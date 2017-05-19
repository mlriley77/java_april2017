package com.gc.library.gui;

import com.gc.library.dto.BookDto;
import com.gc.library.Library;
import com.gc.library.dto.LibraryItemDto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by maurice on 5/2/17.
 */
public class LibraryGui {
    private JPanel base;
    private JLabel logo;
    private JLabel titleTxt;
    private JLabel bannerImg;
    private JList bookList;
    private JButton displayBtn;
    private JButton searchByAuthorBtn;
    private JButton searchByTitleBtn;
    private JButton exitButton;
    private JButton addItemBtn;
    private JTextField searchTxt;
    private DefaultListModel model = new DefaultListModel();
    private Library library = new Library();
    private ListCellRenderer itemRenderer = new ItemRender();

    public LibraryGui() {

        displayBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.clear();
                for(LibraryItemDto book: library.getBookList()){
                    model.addElement(book);
                }
                bookList.setCellRenderer(itemRenderer);
                bookList.setModel(model);
            }
        });
        searchByAuthorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String author = searchTxt.getText().trim();
                ArrayList<LibraryItemDto> libraryItems = library.searchByAuthor(author);
                model.clear();
                for(LibraryItemDto item: libraryItems){
                    model.addElement(item);
                }
                bookList.setCellRenderer(itemRenderer);
                bookList.setModel(model);
            }
        });
        searchByTitleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String titleKeyword = searchTxt.getText().trim();
                ArrayList<LibraryItemDto> libraryItems = library.searchByTitleKeyWord(titleKeyword);
                model.clear();
                for(LibraryItemDto item: libraryItems){
                    model.addElement(item);
                }
                bookList.setCellRenderer(itemRenderer);
                bookList.setModel(model);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //Add a book created by the user to the library
        addItemBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //show add book dialog
                AddBookDialog addBook = new AddBookDialog();
                addBook.pack();
                addBook.setVisible(true);
                //get book object result from add book dialog
                BookDto result = addBook.getResult();
                //add book result to library
                library.addBook(result);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LibraryGui");
        frame.setContentPane(new LibraryGui().base);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /*
    * Custom Initialization code
     */
    private void createUIComponents() {

        ImageIcon logoImg = new ImageIcon("img/logo.png");
        logo = new JLabel(logoImg);

        ImageIcon banner = new ImageIcon("img/banner.jpg");
        bannerImg = new JLabel(banner);

        //populate book list
        bookList = new JList();
    }
}
