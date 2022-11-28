package test;

public class Employee {
    private  String empId;
    private int income;
    private String name;
    private String empDepart;
    private String phone;
    private String addr;
    public Employee( String empId,int income,String name,String empDepart,String phone,String addr)
    {
        this.empId=empId;
        this.income=income;
        this.name=name;
        this.empDepart=empDepart;
        this.phone=phone;
        this.addr=addr;
    }
    public String getEmpId()
    {
        return empId;
    }

    public void setEmpId(String empId)
    {
        this.empId=empId;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpDepart() {
        return empDepart;
    }

    public void setEmpDepart(String empDepart) {
        this.empDepart = empDepart;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", income=" + income +
                ", name='" + name + '\'' +
                ", empDepart='" + empDepart + '\'' +
                ", phone='" + phone + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
