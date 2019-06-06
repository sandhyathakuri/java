package Collections.Collection_Interface.List_Interface.Array_List;

import java.time.LocalDate;

public class Employee {
    private long emId;
    private String empName;
    private String Address;
    private LocalDate localDate;

    public Employee(){

    }
   public Employee(long emId, String empName, String address, LocalDate localDate) {
        this.emId = emId;
        this.empName= empName;
        Address = address;
        this.localDate = localDate;

   }

    public Employee(long emId) {
        this.emId = emId;
    }

    public long getEmId() {
        return emId;
    }

    public void setEmId(long emId) {
        this.emId = emId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emId=" + emId +
                ", empName='" + empName + '\'' +
                ", Address='" + Address + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
