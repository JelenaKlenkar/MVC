/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klenkar.summertask;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class Start {
    private List<Applicant> applicants= new ArrayList<Applicant>();
    public Start(){
        applicants=new ArrayList<>();
        main_loop:
        while(true){
        menu();
        switch(Helper.enterInteger("Enter number from menu: ")){
            case 1:
                listApplicants();
        }
    }
        
    }
    private void menu(){
        System.out.println("===MENU SELECTION===");
        System.out.println("1.List all the applicants");
        System.out.println("2.Enter new applicant");
        System.out.println("3.Edit applicant");
        System.out.println("4.Delete applicant");
        System.out.println("5.Open ERA diagram");
        System.out.println("6.Open GITHUB code");
        System.out.println("7.Exit the program");
    }
    //set the values for private fields in POJO Class applicant
    
    private Applicant setValues(Applicant a){
        a.setFirstName(Helper.enterString("Enter first name: "));
        a.setLastName(Helper.enterString("Enter last name: "));
        a.setAddress(Helper.enterString("Enter address: "));
        a.setPhoneNumber(Helper.enterInteger("Enter phone number: "));
        a.setEmail(Helper.enterString("Enter email: "));
        a.setPersonalIdentificationNumber(Helper.enterInteger("Enter personal identification number: "));
        a.setApplicantCV(Helper.enterString("Enter applicant CV: "));
        a.setMotivationalLetter(Helper.enterString("Enter motivational letter: "));
        return a;
    }
    public static void main(String[] args) {
        new Start();
    }

    private void listApplicants() {
       connection=ConnectToDatabase.getConnection();
       
           
       }
    }
}
