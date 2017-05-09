package com.test.dao;

import com.test.dto.ItemDao;
import com.test.dto.UserDto;

import java.util.ArrayList;

/**
 * Created by maurice on 5/9/17.
 * Implementation of Dao for hibernate
 */
public class HibernateDao implements Dao {
    public void addUser(UserDto userDto) {
        //TODO add hibernate save code here
    }

    public ArrayList<ItemDao> getItemsList() {
        //TODO hibernate query code here
        return null;
    }
}
