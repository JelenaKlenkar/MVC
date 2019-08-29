/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources;

import human_resources.controller.ProcessingApplicant;
import human_resources.model.Applicant;
import human_resources.utility.JelenaException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jelena
 */
public class Start {
    
    public static void main(String[] args) {
        
        Applicant a = new Applicant();
        
        a.setFirstName(JOptionPane.showInputDialog("Enter first name: "));
        a.setLastName(JOptionPane.showInputDialog("Enter last name: "));
        a.setAddress(JOptionPane.showInputDialog("Enter address: "));
        a.setPhoneNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter phone number: ")));
        a.setEmail(JOptionPane.showInputDialog("Enter email: "));
        a.setPersonalIdentificationNumber(Integer.parseInt("Enter personal identification number: "));
        a.setApplicantCV(JOptionPane.showInputDialog("Enter applicant cv: "));
        a.setMotivationalLetter(JOptionPane.showInputDialog("Enter motivational letter: "));
        
        ProcessingApplicant pa = new ProcessingApplicant();
        
        try {
            pa.create(a);
        } catch (JelenaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
