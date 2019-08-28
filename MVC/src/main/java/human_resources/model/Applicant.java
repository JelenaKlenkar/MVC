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
public class Applicant extends Entity {

    private String firstName;
    private String lastName;
    private String address;
    private Integer phoneNumber;
    private String email;
    private Integer personalIdentificationNumber;
    private String applicantCV;
    private String motivationalLetter;

    //default constructor
    public Applicant() {
    }

    //parameterized constructor
    public Applicant(Integer id, String firstName, String lastName, String address, Integer phoneNumber, String email, Integer personalIdentificationNumber, String applicantCV, String motivationalLetter) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.personalIdentificationNumber = personalIdentificationNumber;
        this.applicantCV = applicantCV;
        this.motivationalLetter = motivationalLetter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }

    public void setPersonalIdentificationNumber(Integer personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
    }

    public String getApplicantCV() {
        return applicantCV;
    }

    public void setApplicantCV(String applicantCV) {
        this.applicantCV = applicantCV;
    }

    public String getMotivationalLetter() {
        return motivationalLetter;
    }

    public void setMotivationalLetter(String motivationalLetter) {
        this.motivationalLetter = motivationalLetter;
    }

}
