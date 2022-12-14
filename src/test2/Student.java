package test2;

public class Student {
    int id;
    String first_name;
    String  last_name;
    char gender;
    String hs_city;
    String hs_state;
    int hs_zip;
    String email;
    float entry_age;

    public Student(int id, String first_name, String last_name, char gender, String hs_city, String hs_state, int hs_zip, String email, float entry_age) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.hs_city = hs_city;
        this.hs_state = hs_state;
        this.hs_zip = hs_zip;
        this.email = email;
        this.entry_age = entry_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHs_city() {
        return hs_city;
    }

    public void setHs_city(String hs_city) {
        this.hs_city = hs_city;
    }

    public String getHs_state() {
        return hs_state;
    }

    public void setHs_state(String hs_state) {
        this.hs_state = hs_state;
    }

    public int getHs_zip() {
        return hs_zip;
    }

    public void setHs_zip(int hs_zip) {
        this.hs_zip = hs_zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getEntry_age() {
        return entry_age;
    }

    public void setEntry_age(float entry_age) {
        this.entry_age = entry_age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender=" + gender +
                ", hs_city='" + hs_city + '\'' +
                ", hs_state='" + hs_state + '\'' +
                ", hs_zip=" + hs_zip +
                ", email='" + email + '\'' +
                ", entry_age=" + entry_age +
                '}';
    }
}
