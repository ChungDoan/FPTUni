/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import dal.DBContext;
import java.sql.Connection;

/**
 *
 * @author chungDoan
 */
public class Users extends DBContext{
    //6 thuoc tinh tuong duong 6 thuoc tinh trong ban user cua db
    private String account, password,name,gender,address,dob;

    //3 constructor : ko tham so , all tham so , 2 tham so 
    public Users() {
    }

    public Users(String account, String password, String name, String gender, String address, String dob) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
    }

    public Users(String password, String name) {
        this.password = password;
        this.name = name;
        //chua bic xu ly j, trc het connect da
        connect();
    }

    
    //get , set
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

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


    //khai bao cac thanh phan xu ly database
    Connection cnn; // ket noi db

    private void connect() {
        cnn = super.connection;
        if(cnn != null){
            System.out.println("Connect ok.");
        }else {
            System.out.println("Connect fail");
        }
    }
    
    
    
}
