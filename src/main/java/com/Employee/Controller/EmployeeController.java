package com.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Entity.EmployeeStatus;
import com.Employee.Service.EmployeeService;
import com.Employee.TaxDeductionDTO.EmployeeTax;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public EmployeeStatus saveEmployee(@Valid @RequestBody Employee employee) {
        EmployeeStatus employeeStatus = new EmployeeStatus();

        if (employeeService.saveorUpdate(employee) != null) {
            employeeStatus.setStatusCode(200);
            employeeStatus.setStatusMessage("Inserted Successfully");
        } else {
            employeeStatus.setStatusMessage("please check the given data input");
            employeeStatus.setStatusCode(500);
        }
        return employeeStatus;
    }
	
	 @GetMapping("/employeeTaxes")
	    public List<EmployeeTax> getAllEmployees() {
	        return employeeService.getEmployeesTax();
	    }
}
