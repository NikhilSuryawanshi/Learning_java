package classobject.requ;

public class SchlStudent implements Student{
    int roll;
    String name;
    String email;
    int std;
    public SchlStudent(String name,String email,int std)
    {
        roll++;
        this.name=name;
        this.email=email;
        this.std=std;
    }


    @Override
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "SchlStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", std=" + std +
                '}';
    }
}
