package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US019StaffUserPojo {

    private Boolean activated;
    private String createdBy;
    private String createdDate;
    private String email;
    private String firstName;
    private Integer id;
    private String imageUrl;
    private String langKey;
    private String lastName;
    private String login;
    private String resetDate;
    private String ssn;

    public US019StaffUserPojo() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param createdDate
     * @param langKey
     * @param resetDate
     * @param createdBy
     * @param imageUrl
     * @param id
     * @param login
     * @param email
     * @param activated
     * @param ssn
     */
    public US019StaffUserPojo(Boolean activated, String createdBy, String createdDate, String email, String firstName, Integer id, String imageUrl, String langKey, String lastName, String login, String resetDate, String ssn) {
        super();
        this.activated = activated;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.email = email;
        this.firstName = firstName;
        this.id = id;
        this.imageUrl = imageUrl;
        this.langKey = langKey;
        this.lastName = lastName;
        this.login = login;
        this.resetDate = resetDate;
        this.ssn = ssn;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getResetDate() {
        return resetDate;
    }

    public void setResetDate(String resetDate) {
        this.resetDate = resetDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "US019UserPojo{" +
                "activated=" + activated +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", langKey='" + langKey + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", resetDate='" + resetDate + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(US019UserPojo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activated");
        sb.append('=');
        sb.append(((this.activated == null)?"<null>":this.activated));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("langKey");
        sb.append('=');
        sb.append(((this.langKey == null)?"<null>":this.langKey));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("login");
        sb.append('=');
        sb.append(((this.login == null)?"<null>":this.login));
        sb.append(',');
        sb.append("resetDate");
        sb.append('=');
        sb.append(((this.resetDate == null)?"<null>":this.resetDate));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }*/

}
