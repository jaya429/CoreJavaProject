package com.svr.clone;

/**
 * @author Venkata Saripella
 *
 */
public class Employee implements Cloneable{

    private String     employeeName;
    private Integer    employeeId;
    private Double     empSalary;
    
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", empSalary=" + empSalary
                +",hashcode="+hashCode()+ "]";
    }
    
    @Override
    public Employee clone(){
        Employee employee = null;
        try {
            employee = (Employee)super.clone();
            
        } catch (Exception e) {
        }
        return employee;
    }    
    
}
