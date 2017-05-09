package com.test.controller;

import com.test.dao.Dao;
import com.test.dto.ItemDao;
import com.test.dto.UserDto;
import com.test.factory.DaoFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by maurice on 5/8/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    ModelAndView helloWorld(){
        return new ModelAndView("welcome","message","Hello World");
    }

    /*
    * Add user to database - Using DAO and Factory design patterns here
     */
    @RequestMapping("/adduser")
    ModelAndView addUser(UserDto userDto){

        Dao dao = DaoFactory.getInstance(DaoFactory.JDBC);
        dao.addUser(userDto);

        return new ModelAndView("welcome","message","User Added!");
    }

    /*
    * Get list of items from product DB table and return data/dto/model to list.jsp
     */
    @RequestMapping("/showitems")
    ModelAndView showItems(){
        Dao dao = DaoFactory.getInstance(DaoFactory.JDBC);
        ArrayList<ItemDao> items = dao.getItemsList();

        return new ModelAndView("list","itemlist",items);
    }

}
