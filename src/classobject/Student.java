package classobject;

public class Student {
    int roll_no;
    String name;
    String surname;
    int std;
    String email;
    String mobile;

     Student(int roll_no,String name,String surname,int std,String email,String mobile)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.surname=surname;
        this.std=std;
        this.email=email;
        this.mobile=mobile;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", std=" + std +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
