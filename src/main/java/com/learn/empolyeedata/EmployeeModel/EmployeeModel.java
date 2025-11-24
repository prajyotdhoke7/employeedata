package com.learn.empolyeedata.EmployeeModel;

public class EmployeeModel {
    private int empId;
    private  String empName;
    private String empAddress;
    private String empPhone;
    private double empSalary;


    public EmployeeModel(int empId, String empName, String empAddress, String empPhone, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empPhone = empPhone;
        this.empSalary = empSalary;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }


}
