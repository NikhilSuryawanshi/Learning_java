package test1;

public class Student {
    int roll;
    String name;
    String surname;
    String add;
    String email;

    public Student(int roll,String name,String surname, String add,String email)
    {
        this.roll=roll;
        this.name=name;
        this.surname=surname;
        this.add=add;
        this.email=email;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}'+"\n";
    }
}
