/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.controller;

import human_resources.model.Applicant;
import human_resources.utility.JelenaException;
import human_resources.utility.ProcessingInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class ProcessingApplicant extends Processing<Applicant> implements ProcessingInterface<Applicant> {

    public ProcessingApplicant() {
        super();
    }

    public List<Applicant> read() {

        List<Applicant> applicants = new ArrayList<>();

        Applicant a = new Applicant(1, "Ana", "Anić", "Zagrebačka 78, "
                + "31000 Osijek", 0113257, "aanic@gmail.com", 1222456,
                "https://www.thebalancecareers.com/how-to-write-a-curriculum-vitae-cv-2058494",
                "https://www.mastersavenue.com/articles-guides/how-to-get-in/motivational-letter");

        applicants.add(a);
        return applicants;

    }

    public Applicant create(Applicant a) throws JelenaException {
        controlFirstName(a);
        controlLastName(a);
        return a;
    }

    public void update(Applicant a) throws JelenaException {
        controlFirstName(a);
        controlLastName(a);
        dao.save(a);
    }

    private void controlFirstName(Applicant a) throws JelenaException {
        if (a.getFirstName() != null) {
            a.setFirstName(a.getFirstName().trim());
        }
        if (a.getFirstName() == null || a.getFirstName().length() == 0) {
            throw new JelenaException("First name needs to be entered");
        }
        if (a.getFirstName().length() > 50) {
            throw new JelenaException("First name cannot contain more then 50 letters");
        }

    }

    private void controlLastName(Applicant a) throws JelenaException {
        if (a.getLastName() != null) {
            a.setLastName(a.getLastName().trim());
        }
        if (a.getLastName() == null || a.getLastName().length() == 0) {
            throw new JelenaException("Last name needs to be entered");
        }
        if (a.getLastName().length() > 50) {
            throw new JelenaException("Last name cannot contain more then 50 letters");
        }

    }

    private void controlAddress(Applicant a) throws JelenaException {

        if (a.getAddress() == null || a.getAddress().length() == 0) {
            throw new JelenaException("Address needs to be entered");
        }
        if (a.getAddress().length() > 50) {
            throw new JelenaException("Address cannot contain more then 50 letters");
        }

    }

    public void controlPhoneNumber(Applicant a) throws JelenaException {
        if (a.getPhoneNumber() == null) {
            throw new JelenaException("Phone number needs to be entered");

        }
        
    }

    public boolean delete(Applicant a) {
        System.out.println("Delete from database");
        return true;
    }

}
