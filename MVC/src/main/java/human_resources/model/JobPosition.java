/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.model;

/**
 *
 * @author Jelena
 */
public class JobPosition extends Entity {

    private String nameOfJobPosition;
    private String jobDescription;

    public JobPosition() {
    }

    public JobPosition(Integer id, String nameOfJobPosition, String jobDescription) {
        super(id);
        this.nameOfJobPosition = nameOfJobPosition;
        this.jobDescription = jobDescription;
    }

    public String getNameOfJobPosition() {
        return nameOfJobPosition;
    }

    public void setNameOfJobPosition(String nameOfJobPosition) {
        this.nameOfJobPosition = nameOfJobPosition;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

}
