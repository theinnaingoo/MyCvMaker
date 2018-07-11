package skylark.intern.demon.mycvmaker.Model;

public class M_Profile {
    private int id;
    private String name, father, birthday, nrc, city, phone, email,gender, maritial;

    public M_Profile() {
    }

    public M_Profile(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFather() {
        return father;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNrc() {
        return nrc;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritial() {
        return maritial;
    }

    public void setMaritial(String maritial) {
        this.maritial = maritial;
    }
}
