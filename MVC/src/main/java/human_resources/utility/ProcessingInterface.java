/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.utility;

import java.util.List;

/**
 *
 * @author Jelena
 */
public interface ProcessingInterface<T> {
    
    public T create (T entity) throws JelenaException;
    public List<T> read();
    public void update (T entity) throws JelenaException;
    public boolean delete (T entity);
    
}
