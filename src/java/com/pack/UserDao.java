/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pack;

import com.model.User;
import com.util.JavaConnectDb;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;

//Dao name, RequestScoped setting
@Named(value = "ksbDao")
@javax.enterprise.context.RequestScoped
public class UserDao {

     //Oracle DB Connect Class (select query)
    public List<User> getUser(){
        System.out.println("Dao Running");
		List<User> listUser = new ArrayList<User>();
		try {
			Connection conn = JavaConnectDb.getConnection();
			ResultSet rs;
				Statement stmt = conn.createStatement();
				rs = stmt.executeQuery("select * from SHIP_INFO");
					while(rs.next()){
						User u = new User();
                                                u.setTest1(rs.getString(1));
                                                u.setTest2(rs.getString(2));
                                                u.setTest3(rs.getString(3));
                                                u.setTest4(rs.getString(4));
                                                u.setTest5(rs.getString(5));
                                                u.setTest6(rs.getString(6));
                                                u.setTest7(rs.getInt(7));
                                                u.setTest8(rs.getDate(8));
                                                u.setTest9(rs.getDate(9));
                                                u.setTest10(rs.getInt(10));
                                                u.setTest11(rs.getString(11));
                                                u.setTest12(rs.getString(12));
                                                u.setTest13(rs.getString(13));
                                                u.setTest14(rs.getString(14));
                                                u.setTest15(rs.getString(15));
                                                u.setTest16(rs.getString(16));
                                                u.setTest17(rs.getInt(17));
                                                u.setTest18(rs.getInt(18));
                                                u.setTest19(rs.getDate(19));
                                                u.setTest20(rs.getDate(20));
                                                u.setTest21(rs.getString(21));
                                                u.setTest22(rs.getString(22));
                                                u.setTest23(rs.getString(23));
                                                u.setTest24(rs.getString(24));
                                                u.setTest25(rs.getString(25));
                                                u.setTest26(rs.getString(26));
                                                u.setTest27(rs.getString(27));
                                                u.setTest28(rs.getString(28));
                                                u.setTest29(rs.getString(29));
                                                u.setTest30(rs.getString(30));
                                                u.setTest31(rs.getString(31));
                                                u.setTest32(rs.getDate(32));
                                                u.setTest33(rs.getDate(33));
						listUser.add(u);
					}
                                        rs.close();
                                stmt.close();
                                conn.close();
				return listUser;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    
}
