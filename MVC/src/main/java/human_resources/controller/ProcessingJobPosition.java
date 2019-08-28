/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.JobPosition;
import human_resources.utility.JelenaException;
import human_resources.utility.ProcessingInterface;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingJobPosition extends Processing<JobPosition> implements ProcessingInterface<JobPosition>  {
    
    ProcessingJobPosition(){
        
    }

    @Override
    public JobPosition create(JobPosition entity) throws JelenaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<JobPosition> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(JobPosition entity) throws JelenaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(JobPosition entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
