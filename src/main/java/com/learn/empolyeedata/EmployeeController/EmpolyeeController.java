package com.learn.empolyeedata.EmployeeController;

import com.learn.empolyeedata.EmployeeModel.EmployeeModel;
import com.learn.empolyeedata.EmployeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmpolyeeController {
    @Autowired
    EmployeeService ser;

    @GetMapping("/employee")
    public List<EmployeeModel> getAllEmployeeData(){
       return ser.allEmployessData();
    }

    @PostMapping("/addemployee")
    public Map<String,String> addEmployee(@RequestBody EmployeeModel addEmployee){
        ser.addEmployee(addEmployee);
        Map<String, String> result = Map.of("Status", "Success");
        return result;

    }

}
