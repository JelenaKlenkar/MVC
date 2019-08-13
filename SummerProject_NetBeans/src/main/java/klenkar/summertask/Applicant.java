/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klenkar.summertask;

/**
 *
 * @author Jelena
 */
public class Applicant {
    
    //define private fields
    
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private int phoneNumber;
    private String email;
    private  int personalIdentificationNumber;
    private String applicantCV;
    private String motivationalLetter;
    
      //default constructor
    public Applicant() {
    }
    
    //parameterized constructor
    public Applicant(int id, String firstName, String lastName, String address, int phoneNumber, String email, int personalIdentificationNumber, String applicantCV, String motivationalLetter) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.personalIdentificationNumber = personalIdentificationNumber;
        this.applicantCV = applicantCV;
        this.motivationalLetter = motivationalLetter;
    }
     
    
    //public methods

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the personalIdentificationNumber
     */
    public int getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }

    /**
     * @param personalIdentificationNumber the personalIdentificationNumber to set
     */
    public void setPersonalIdentificationNumber(int personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
    }

    /**
     * @return the applicantCV
     */
    public String getApplicantCV() {
        return applicantCV;
    }

    /**
     * @param applicantCV the applicantCV to set
     */
    public void setApplicantCV(String applicantCV) {
        this.applicantCV = applicantCV;
    }

    /**
     * @return the motivationalLetter
     */
    public String getMotivationalLetter() {
        return motivationalLetter;
    }

    /**
     * @param motivationalLetter the motivationalLetter to set
     */
    public void setMotivationalLetter(String motivationalLetter) {
        this.motivationalLetter = motivationalLetter;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName(); 
    }
    
    
}
