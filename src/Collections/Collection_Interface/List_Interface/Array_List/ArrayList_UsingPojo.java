package Collections.Collection_Interface.List_Interface.Array_List;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayList_UsingPojo {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmId(20);
        employee.setEmpName("John smith");
        employee.setAddress("100 Main st");
        employee.setLocalDate(LocalDate.now());


        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee(20,"Josh", "120 Main st", LocalDate.now()));

        employeeArrayList.add(employee);
        System.out.println(employeeArrayList);

    }
}
