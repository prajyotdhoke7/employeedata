package com.learn.empolyeedata.EmployeeController;

import com.learn.empolyeedata.EmployeeModel.EmployeeModel;
import com.learn.empolyeedata.EmployeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpolyeeController {
    @Autowired
    EmployeeService ser;

    @GetMapping("/employee")
    public List<EmployeeModel> getAllEmployeeData(){
       return ser.allEmployessData();
    }

}
