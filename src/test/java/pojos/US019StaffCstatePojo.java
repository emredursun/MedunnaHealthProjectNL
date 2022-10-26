package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US019StaffCstatePojo {

    private US019StaffCountry2Pojo country;
    private Integer id;
    private String name;

    public US019StaffCstatePojo() {
    }

    /**
     *
     * @param country
     * @param name
     * @param id
     */
    public US019StaffCstatePojo(US019StaffCountry2Pojo country, Integer id, String name) {
        super();
        this.country = country;
        this.id = id;
        this.name = name;
    }

    public US019StaffCountry2Pojo getCountry() {
        return country;
    }

    public void setCountry(US019StaffCountry2Pojo country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "US019CstatePojo{" +
                "country=" + country +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(US019CstatePojo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }*/

}