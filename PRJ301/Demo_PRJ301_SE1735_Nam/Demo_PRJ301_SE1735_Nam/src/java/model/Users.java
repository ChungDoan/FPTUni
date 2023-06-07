/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author thant
 */
public class Users extends DBContext{
    //same attributes with table Users on db
    private String account, password, name, gender, address, dob;

    public Users() {
    }
    
    public Users (String account, String password, String name, String gender, String address, String dob) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
    }

    public Users (String account, String password) {
        this.account = account;
        this.password = password;
        //
        connect();
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    //Khai bao cac thanh phan xu ly DB
    Connection cnn;//Ket noi DB (file DBContext)
    Statement stm;//Thuc hien cau lenh SQL
    ResultSet rs;//Luu tru va xu ly du lieu
    
    
    private void connect() {
        cnn = super.connection;
        if (cnn!=null){
            System.out.println("Connect success");
        } else {
            System.out.println("Connect fail");
        }
    }
    
    //just created
    public boolean checkLogin() {
        try {
            //concat string "account" and "password"
            String strSQL="select * from Users where account='"+account+"' and Password='"+password+"'";
            //assign statment object
            stm=cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            //using statement object to execute query
            //assign result set to rs
            rs=stm.executeQuery(strSQL);
            while (rs.next()) {
                //Vao duoc day tuc la rs.next tra ve true
                //meaning rs co gia tri
                //meaning select co tra ve gia tri khac null
                //meaning account va password input co ton tai
                //meaning login success
                return true;
            }
        } catch (Exception e) {
            System.out.println("checkLogin:"+e.getMessage());
        }
        return false;
    }

    public String getNameByAccount() {
        try {
            //concat string "account" and "password"
            String strSQL="select * from Users where account='"+account+"'";
            //assign statment object
            stm=cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            //using statement object to execute query
            //assign result set to rs
            rs=stm.executeQuery(strSQL);
            while (rs.next()) {
                //dang "select *" o tren nen chon colum 3 (colum name)
                String name=rs.getString(3);
                return name;
            }
        } catch (Exception e) {
            System.out.println("getNameByAccount:"+e.getMessage());
        }
        return "";
    }

    public ArrayList<Users> getListUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
