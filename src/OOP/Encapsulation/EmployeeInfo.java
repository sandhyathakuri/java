package OOP.Encapsulation;

public class EmployeeInfo {
    public static void main(String[] args) {

        EmpCount empOne = new EmpCount();
        empOne.setEmId(11);
        empOne.setEmpAge(30);
        empOne.setEmpFirstName("Lara");
        empOne.setEmpLastNmae("Joe");

        System.out.println("Id =" + empOne.getEmId() + "Age =" + empOne.getEmpAge()
                + "First name =" + empOne.getEmpFirstName() +"LastName ="+ empOne.getEmpLastName()  );


    }
}
