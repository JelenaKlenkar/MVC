/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.utility.DAO;

/**
 *
 * @author Jelena
 */
public abstract class Processing<T> {
    
    protected DAO<T> dao;
    
    public Processing(){
       dao=new DAO <>();
    }
    
}
