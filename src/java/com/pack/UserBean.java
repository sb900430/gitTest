/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pack;

import com.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedProperty;
import javax.inject.Named;

//bean name setting and RequestScoped setting
@Named(value = "ksbBean")
@javax.enterprise.context.RequestScoped
public class UserBean{

        //Dao setting
        @ManagedProperty(value = "#{ksbDao}")
        private UserDao Dao = new UserDao();


    List<User> listUser = new ArrayList<>();
    Map<Object, Object> listKsb = new HashMap<>();
    Map<Object, Object> listKsb2 = new HashMap<>();
    Map<Object, Object> listKsb3 = new HashMap<>();
    Map<Object, Object> listKsb4 = new HashMap<>();
    Map<Object, Object> listKsb5 = new HashMap<>();
    Map<Object, Object> listKsb6 = new HashMap<>();

    
        
    
        
    public String test001(){
        System.out.println("method start");
        listKsb.put("test1", "test1");
        listKsb.put("test2", "test1");
        listKsb.put("test3", "test1");
        listKsb.put("test4", "test1");
        listKsb.put("test5", "test1");
        listKsb.put("test6", "test1");
        listKsb.put("test7", "test1");
        listKsb.put("test8", "test1");
        listKsb.put("test9", "test1");
        listKsb.put("test10", "test1");
        listKsb.put("test11", "test1");
        listKsb.put("test12", "test1");
        listKsb.put("test13", "test1");
        listKsb.put("test14", "test1");
        listKsb.put("test15", "test1");
        listKsb.put("test16", "test1");
        listKsb.put("test17", "test1");
        listKsb.put("test18", "test1");
        listKsb.put("test19", "test1");
        listKsb.put("test20", "test1");
        listKsb.put("test21", "test1");
        listKsb.put("test22", "test1");
        listKsb.put("test23", "test1");
        listKsb.put("test24", "test1");
        listKsb.put("test25", "test1");
        listKsb.put("test26", "test1");
        listKsb.put("test27", "test1");
        listKsb.put("test28", "test1");
        listKsb.put("test29", "test1");
        listKsb.put("test30", "test1");
        listKsb.put("test31", "test1");
        listKsb.put("test32", "test1");
        listKsb.put("test33", "test1");
        
        listKsb2.put("test1", "test1");
        listKsb2.put("test2", "test1");
        listKsb2.put("test3", "test1");
        listKsb2.put("test4", "test1");
        listKsb2.put("test5", "test1");
        listKsb2.put("test6", "test1");
        listKsb2.put("test7", "test1");
        listKsb2.put("test8", "test1");
        listKsb2.put("test9", "test1");
        listKsb2.put("test10", "test1");
        listKsb2.put("test11", "test1");
        listKsb2.put("test12", "test1");
        listKsb2.put("test13", "test1");
        listKsb2.put("test14", "test1");
        listKsb2.put("test15", "test1");
        listKsb2.put("test16", "test1");
        listKsb2.put("test17", "test1");
        listKsb2.put("test18", "test1");
        listKsb2.put("test19", "test1");
        listKsb2.put("test20", "test1");
        listKsb2.put("test21", "test1");
        listKsb2.put("test22", "test1");
        listKsb2.put("test23", "test1");
        listKsb2.put("test24", "test1");
        listKsb2.put("test25", "test1");
        listKsb2.put("test26", "test1");
        listKsb2.put("test27", "test1");
        listKsb2.put("test28", "test1");
        listKsb2.put("test29", "test1");
        listKsb2.put("test30", "test1");
        listKsb2.put("test31", "test1");
        listKsb2.put("test32", "test1");
        listKsb2.put("test33", "test1");
        
        listKsb3.put("test1", "test1");
        listKsb3.put("test2", "test1");
        listKsb3.put("test3", "test1");
        listKsb3.put("test4", "test1");
        listKsb3.put("test5", "test1");
        listKsb3.put("test6", "test1");
        listKsb3.put("test7", "test1");
        listKsb3.put("test8", "test1");
        listKsb3.put("test9", "test1");
        listKsb3.put("test10", "test1");
        listKsb3.put("test11", "test1");
        listKsb3.put("test12", "test1");
        listKsb3.put("test13", "test1");
        listKsb3.put("test14", "test1");
        listKsb3.put("test15", "test1");
        listKsb3.put("test16", "test1");
        listKsb3.put("test17", "test1");
        listKsb3.put("test18", "test1");
        listKsb3.put("test19", "test1");
        listKsb3.put("test20", "test1");
        listKsb3.put("test21", "test1");
        listKsb3.put("test22", "test1");
        listKsb3.put("test23", "test1");
        listKsb3.put("test24", "test1");
        listKsb3.put("test25", "test1");
        listKsb3.put("test26", "test1");
        listKsb3.put("test27", "test1");
        listKsb3.put("test28", "test1");
        listKsb3.put("test29", "test1");
        listKsb3.put("test30", "test1");
        listKsb3.put("test31", "test1");
        listKsb3.put("test32", "test1");
        listKsb3.put("test33", "test1");
        
        listKsb4.put("test1", "test1");
        listKsb4.put("test2", "test1");
        listKsb4.put("test3", "test1");
        listKsb4.put("test4", "test1");
        listKsb4.put("test5", "test1");
        listKsb4.put("test6", "test1");
        listKsb4.put("test7", "test1");
        listKsb4.put("test8", "test1");
        listKsb4.put("test9", "test1");
        listKsb4.put("test10", "test1");
        listKsb4.put("test11", "test1");
        listKsb4.put("test12", "test1");
        listKsb4.put("test13", "test1");
        listKsb4.put("test14", "test1");
        listKsb4.put("test15", "test1");
        listKsb4.put("test16", "test1");
        listKsb4.put("test17", "test1");
        listKsb4.put("test18", "test1");
        listKsb4.put("test19", "test1");
        listKsb4.put("test20", "test1");
        listKsb4.put("test21", "test1");
        listKsb4.put("test22", "test1");
        listKsb4.put("test23", "test1");
        listKsb4.put("test24", "test1");
        listKsb4.put("test25", "test1");
        listKsb4.put("test26", "test1");
        listKsb4.put("test27", "test1");
        listKsb4.put("test28", "test1");
        listKsb4.put("test29", "test1");
        listKsb4.put("test30", "test1");
        listKsb4.put("test31", "test1");
        listKsb4.put("test32", "test1");
        listKsb4.put("test33", "test1");

        listKsb5.put("test1", "test1");
        listKsb5.put("test2", "test1");
        listKsb5.put("test3", "test1");
        listKsb5.put("test4", "test1");
        listKsb5.put("test5", "test1");
        listKsb5.put("test6", "test1");
        listKsb5.put("test7", "test1");
        listKsb5.put("test8", "test1");
        listKsb5.put("test9", "test1");
        listKsb5.put("test10", "test1");
        listKsb5.put("test11", "test1");
        listKsb5.put("test12", "test1");
        listKsb5.put("test13", "test1");
        listKsb5.put("test14", "test1");
        listKsb5.put("test15", "test1");
        listKsb5.put("test16", "test1");
        listKsb5.put("test17", "test1");
        listKsb5.put("test18", "test1");
        listKsb5.put("test19", "test1");
        listKsb5.put("test20", "test1");
        listKsb5.put("test21", "test1");
        listKsb5.put("test22", "test1");
        listKsb5.put("test23", "test1");
        listKsb5.put("test24", "test1");
        listKsb5.put("test25", "test1");
        listKsb5.put("test26", "test1");
        listKsb5.put("test27", "test1");
        listKsb5.put("test28", "test1");
        listKsb5.put("test29", "test1");
        listKsb5.put("test30", "test1");
        listKsb5.put("test31", "test1");
        listKsb5.put("test32", "test1");
        listKsb5.put("test33", "test1");
        
        listKsb6.put("test1", "test1");
        listKsb6.put("test2", "test1");
        listKsb6.put("test3", "test1");
        listKsb6.put("test4", "test1");
        listKsb6.put("test5", "test1");
        listKsb6.put("test6", "test1");
        listKsb6.put("test7", "test1");
        listKsb6.put("test8", "test1");
        listKsb6.put("test9", "test1");
        listKsb6.put("test10", "test1");
        listKsb6.put("test11", "test1");
        listKsb6.put("test12", "test1");
        listKsb6.put("test13", "test1");
        listKsb6.put("test14", "test1");
        listKsb6.put("test15", "test1");
        listKsb6.put("test16", "test1");
        listKsb6.put("test17", "test1");
        listKsb6.put("test18", "test1");
        listKsb6.put("test19", "test1");
        listKsb6.put("test20", "test1");
        listKsb6.put("test21", "test1");
        listKsb6.put("test22", "test1");
        listKsb6.put("test23", "test1");
        listKsb6.put("test24", "test1");
        listKsb6.put("test25", "test1");
        listKsb6.put("test26", "test1");
        listKsb6.put("test27", "test1");
        listKsb6.put("test28", "test1");
        listKsb6.put("test29", "test1");
        listKsb6.put("test30", "test1");
        listKsb6.put("test31", "test1");
        listKsb6.put("test32", "test1");
        listKsb6.put("test33", "test1");
        
//        listUser.add(listKsb);
//        listUser = Dao.getUser();

        return "KSB2";
    }


    public UserDao getDao() {
        return Dao;
    }

    public void setDao(UserDao Dao) {
        this.Dao = Dao;
    }



    public List<User> getListUser() {
        return listUser;
    }

    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }

    public Map<Object, Object> getListKsb() {
        return listKsb;
    }

    public void setListKsb(Map<Object, Object> listKsb) {
        this.listKsb = listKsb;
    }



        
}
