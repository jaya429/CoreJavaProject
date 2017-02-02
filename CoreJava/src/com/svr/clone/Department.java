package com.svr.clone;

/**
 * @author Venkata Saripella
 *
 */
public class Department implements Cloneable{

    private Integer  departmentId;
    private String   departmentName;
    private Employee employee;
    
    public Integer getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employee="
                + employee +",hashcode="+hashCode()+ "]";
    }
    @Override
    public Department clone(){
        Department department = null;
        try {
            department = (Department)super.clone();
            
        } catch (Exception e) {
        }
        return department;
    }    
    
}
