/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.utility;

/**
 *
 * @author Jelena
 */
public class DAO<T> {

    public T save(T entity) {
        System.out.println("Saved in database");
        return entity;

    }

}
