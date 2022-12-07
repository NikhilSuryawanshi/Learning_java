package classobject.requ;

public class ClgStudent implements Student{
    int rollno=0;
    String name;
    String email;
    String branch;
    int sem;

    public ClgStudent(String name,String email,String branch,int sem)
    {
        rollno++;
        this.name=name;
        this.email=email;
        this.branch=branch;
        this.sem=sem;
    }
    @Override
    public int getRoll() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    @Override
    public String toString() {
        return "ClgStudent{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", branch='" + branch + '\'' +
                ", sem=" + sem +
                '}';
    }
}
