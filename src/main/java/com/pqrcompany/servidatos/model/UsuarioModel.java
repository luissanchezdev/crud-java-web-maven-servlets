/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pqrcompany.servidatos.model;

/**
 *
 * @author luissdev
 */
public class UsuarioModel {
    
    private int id;
    private String name;
    private String phone;
    private String adress;

    public UsuarioModel(int id, String name, String phone, String adress) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }      
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
