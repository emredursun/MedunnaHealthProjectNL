package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US019StaffPostPojo {

    private String adress;
    private String birthDate;
    private String bloodGroup;
    private US019StaffCountry1Pojo US019StaffCountry1Pojo;
    private String createdBy;
    private String createdDate;
    private US019StaffCstatePojo US019StaffCstatePojo;
    private String description;
    private String firstName;
    private String gender;
    private String lastName;
    private String phone;
    private String ssn;
    private US019StaffUserPojo US019StaffUserPojo;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public US019StaffCountry1Pojo getUS019Country1Pojo() {
        return US019StaffCountry1Pojo;
    }

    public void setUS019Country1Pojo(US019StaffCountry1Pojo US019StaffCountry1Pojo) {
        this.US019StaffCountry1Pojo = US019StaffCountry1Pojo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public US019StaffCstatePojo getUS019CstatePojo() {
        return US019StaffCstatePojo;
    }

    public void setUS019CstatePojo(US019StaffCstatePojo US019StaffCstatePojo) {
        this.US019StaffCstatePojo = US019StaffCstatePojo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public US019StaffUserPojo getUS019UserPojo() {
        return US019StaffUserPojo;
    }

    public void setUS019UserPojo(US019StaffUserPojo US019StaffUserPojo) {
        this.US019StaffUserPojo = US019StaffUserPojo;
    }


}
