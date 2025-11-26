package com.learn.empolyeedata.EmployeeService;

import com.learn.empolyeedata.EmployeeModel.EmployeeModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Component
public class EmployeeService {

    List<EmployeeModel> employeeList =new ArrayList<>(Arrays.asList(new EmployeeModel(101,"Gaurang Arora","Sai nagar,Wani","7219509654",1000000.1)));

    public List<EmployeeModel> allEmployessData(){
        return  employeeList;
    }

    public void addEmployee(EmployeeModel addEmployee) {
        employeeList.add(addEmployee);
    }

    public void updateEmployee(EmployeeModel updateEmp) {
        employeeList.stream()
                .filter(emp -> emp.getEmpId() == updateEmp.getEmpId())
                .findFirst()
                .ifPresent(emp -> {
                    emp.setEmpName(updateEmp.getEmpName());
                    emp.setEmpAddress(updateEmp.getEmpAddress());
                    emp.setEmpPhone(updateEmp.getEmpPhone());
                    emp.setEmpSalary(updateEmp.getEmpSalary());
                });
    }

    public void removeEmployee(int empId) {
        employeeList.stream()
                .filter(p -> p.getEmpId() == empId)
                .findFirst()
                .ifPresent(emp -> removeEmployee(empId));

    }
}
