package com.gc.libterm.controller;

import com.gc.libterm.dto.BookDto;
import com.gc.libterm.dto.LibraryItemDto;
import com.gc.libterm.util.Library;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * Created by maurice on 5/14/17.
 */
@Controller
public class HomeControllerBootTheme {

    /*@RequestMapping("/")
    public ModelAndView helloWorld() {
        return new
                ModelAndView("index", "message", "Hello World!");
    }*/

    /*
    * Show home page
     */
   /* @RequestMapping("/homeboot")
    public ModelAndView home(){
        return new ModelAndView("homeboot", "command", new BookDto());
    }*/

    /*
    * Show bootstrap home page
    */
    @RequestMapping("/homeboottheme")
    public ModelAndView homeboot(){
        return new ModelAndView("homeboottheme", "command", new BookDto());
    }

    @RequestMapping("/searchboottheme")
    public ModelAndView search(@RequestParam("mode") String mode, @RequestParam("searchtxt") String searchtxt, Model model){
        ArrayList<LibraryItemDto> results = null;
        Library lib = new Library();
        switch (mode){
            case "listbooks"://get list of books
                results = lib.getBookList();
                break;

            case "authorsearch"://get list of books by author
                results = lib.searchByAuthor(searchtxt);
                break;

            case "titlesearch"://get list of title keyword
                results = lib.searchByTitleKeyWord(searchtxt);
                break;

            default:
                break;
        }
        model.addAttribute("command", new BookDto());//binding for addbook form
        return new ModelAndView("homeboottheme", "results", results);
    }

    /*
    * Add a new book to DB
     */
    @RequestMapping("/addbookboottheme")
    public ModelAndView addBook(@Valid @ModelAttribute("command") BookDto book, BindingResult result, Model model){
        if (result.hasErrors()) {
            return new ModelAndView("homeboottheme", "message", "helloworld");
        }
        Library lib = new Library();
        lib.addBook(book);
        return new ModelAndView("homeboottheme", "message", "Hello World!");
    }

    /*
    * Modify library item status - return updated book object in json format
     */
    @RequestMapping(value = "/checkoutboottheme", method = RequestMethod.POST, produces="application/json")
    public @ResponseBody String checkOut(@RequestParam("status") boolean status, @RequestParam("id") int id){

        Library lib = new Library();

        LibraryItemDto libItem;

        if(status){//set status to checked out = true
            libItem = lib.checkOutBook(id);
        }else{//set status to checked in = false
            libItem = lib.checkInBook(id);
        }
        //convert to json string
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(libItem);
        //System.out.println(jsonOutput);
        return jsonOutput;
    }
}
