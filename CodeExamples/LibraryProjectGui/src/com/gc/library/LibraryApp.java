package com.gc.library;

import com.gc.library.dto.BookDto;
import com.gc.library.dto.LibraryItemDto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by maurice on 4/30/17.
 */
public class LibraryApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueFlag = true;
        Library library = new Library();
        LibraryItemDto libraryItem;
        String author;
        String titleKeyWord;
        ArrayList<LibraryItemDto> libraryItems;

        //1. Display welcome message
        System.out.println("Welcome to Library Terminal");

        while (continueFlag) {
            //2. Display menu prompt
            System.out.println("1. Display book list\n" +
            "2. Search for book by Author\n" +
            "3. Search for book by Title keyword\n" +
            "4. Check out book\n" +
            "5. Return book\n" +
            "6. Add a book to the library\n" +
            "7. Exit");

            //3. Get user input menu selection
            int userInput = scan.nextInt();
            scan.nextLine();//consume junk character

            //4. Process user input
            switch (userInput){
                case 1://Display book list
                    System.out.println(library.getBookListAsString());
                    break;

                case 2://Search by author
                    //a. prompt user for author name
                    System.out.println("Enter Author's name");
                    //b. get userInput
                    author = scan.nextLine();
                    libraryItems = library.searchByAuthor(author);
                    for(LibraryItemDto item: libraryItems){
                        System.out.println(item);
                    }
                    break;

                case 3://Search by title keyword
                    //a. prompt user for title keyword
                    System.out.println("Enter Title Keyword");
                    //b. get userInput
                    titleKeyWord = scan.nextLine();
                    libraryItems = library.searchByTitleKeyWord(titleKeyWord);
                    for(LibraryItemDto item: libraryItems){
                        System.out.println(item);
                    }
                    break;

                case 4://Checkout book
                    System.out.println(library.getBookListAsString());
                    //display user prompt
                    System.out.println("Select book to check out");
                    //get user input
                    userInput = scan.nextInt();
                    scan.nextLine();//consume junk character
                    //process input
                    library.checkOutBook(userInput);
                    break;

                case 5://Return book
                    System.out.println(library.getBookListAsString());
                    //display user prompt
                    System.out.println("Select book to return");
                    //get user input
                    userInput = scan.nextInt();
                    scan.nextLine();//consume junk character
                    //process input
                    library.checkInBook(userInput);
                    break;

                case 6://add book to library
                    //a. prompt user for author
                    System.out.println("Enter Author's name");
                    //b. get userInput
                    author = scan.nextLine();
                    //c. prompt user for title
                    System.out.println("Enter Title");
                    //d. get userInput
                    titleKeyWord = scan.nextLine();
                    //e. create book object based on user input
                    libraryItem = new BookDto(author, titleKeyWord);
                    //f. add book to library
                    library.addBook(libraryItem);
                    break;

                case 7://exit program
                    continueFlag = false;
                    break;

                default:
                    break;
            }
        }
        //8. Display exit message
        System.out.println("Thank you for using the Library Terminal App");
    }
}
