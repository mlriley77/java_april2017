package com.test.dao;

import com.test.dto.ItemDao;
import com.test.dto.UserDto;

import java.util.ArrayList;

/**
 * Created by maurice on 5/9/17.
 */
public interface Dao {
    //Add user to database
    void addUser(UserDto userDto);

    //get list of all items from products DB table
    ArrayList<ItemDao> getItemsList();
}
