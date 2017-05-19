package com.gc.library.gui;

import com.gc.library.dto.BookDto;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class AddBookDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField bookTitle;
    private JTextField bookAuthor;
    private JTextField imageURL;
    private BookDto result;

    public AddBookDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    /*
    * Return form data as a book object
     */
    public BookDto getResult() {
        return result;
    }

    private void onOK() {
        //create book object from form data
        String title = bookTitle.getText().trim();
        String author = bookAuthor.getText().trim();
        String imageURLTxt = imageURL.getText().trim();

        //assign book object to result member variable
        result = new BookDto(title, author, false, new Date(), imageURLTxt);

        dispose();//returns to parent frame
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
