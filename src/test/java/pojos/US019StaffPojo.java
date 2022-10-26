package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US019StaffPojo {

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
    private Integer id;
    private String lastName;
    private String phone;
    private String ssn;
    private US019StaffUserPojo US019StaffUserPojo;

    public US019StaffPojo() {
    }

    /**
     *
     * @param US019StaffCountry1Pojo
     * @param lastName
     * @param gender
     * @param description
     * @param adress
     * @param birthDate
     * @param ssn
     * @param bloodGroup
     * @param firstName
     * @param createdDate
     * @param US019StaffCstatePojo
     * @param createdBy
     * @param phone
     * @param id
     * @param US019StaffUserPojo
     */
    public US019StaffPojo(String adress, String birthDate, String bloodGroup, US019StaffCountry1Pojo US019StaffCountry1Pojo, String createdBy, String createdDate, US019StaffCstatePojo US019StaffCstatePojo, String description, String firstName, String gender, Integer id, String lastName, String phone, String ssn, US019StaffUserPojo US019StaffUserPojo) {
        super();
        this.adress = adress;
        this.birthDate = birthDate;
        this.bloodGroup = bloodGroup;
        this.US019StaffCountry1Pojo = US019StaffCountry1Pojo;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.US019StaffCstatePojo = US019StaffCstatePojo;
        this.description = description;
        this.firstName = firstName;
        this.gender = gender;
        this.id = id;
        this.lastName = lastName;
        this.phone = phone;
        this.ssn = ssn;
        this.US019StaffUserPojo = US019StaffUserPojo;
    }

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

    public US019StaffCountry1Pojo getCountry() {
        return US019StaffCountry1Pojo;
    }

    public void setCountry(US019StaffCountry1Pojo US019StaffCountry1Pojo) {
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

    public US019StaffCstatePojo getCstate() {
        return US019StaffCstatePojo;
    }

    public void setCstate(US019StaffCstatePojo US019StaffCstatePojo) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public US019StaffUserPojo getUser() {
        return US019StaffUserPojo;
    }

    public void setUser(US019StaffUserPojo US019StaffUserPojo) {
        this.US019StaffUserPojo = US019StaffUserPojo;
    }

    @Override
    public String toString() {
        return "US019AdminPojo{" +
                "adress='" + adress + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", US019Country1Pojo=" + US019StaffCountry1Pojo +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", US019CstatePojo=" + US019StaffCstatePojo +
                ", description='" + description + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", US019UserPojo=" + US019StaffUserPojo +
                '}';
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(US019AdminPojo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adress");
        sb.append('=');
        sb.append(((this.adress == null)?"<null>":this.adress));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("bloodGroup");
        sb.append('=');
        sb.append(((this.bloodGroup == null)?"<null>":this.bloodGroup));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.US019Country1Pojo == null)?"<null>":this.US019Country1Pojo));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("cstate");
        sb.append('=');
        sb.append(((this.US019CstatePojo == null)?"<null>":this.US019CstatePojo));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.US019UserPojo == null)?"<null>":this.US019UserPojo));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }*/

}
