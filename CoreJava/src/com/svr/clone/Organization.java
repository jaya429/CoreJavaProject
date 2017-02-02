package com.svr.clone;

/**
 * @author Venkata Saripella
 *
 */
public class Organization implements Cloneable{

    private Integer    organizationId;
    private Department department;
    private String     organizationName;
    
    public  Organization(){
        
    }
    public Organization(Integer theOrganizationId, Department theDepartment,String theOrganizationName){
        organizationId      = theOrganizationId;
        department          = theDepartment;
        organizationName    = theOrganizationName;
        System.out.println("Constructor invoked");
    }
    
    public Integer getOrganizationId() {
        return organizationId;
    }
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }
    
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
   
    @Override
    public String toString() {
        return "Organization [organizationId=" + organizationId + ", department=" + department + ", organizationName="
                + organizationName + ", hashcode="+hashCode()+"]";
    }
    
    @Override
    public Organization clone(){
        Organization organization = null;
        try {
            organization = (Organization)super.clone();
            
        } catch (Exception e) {
        }
        return organization;
    }
}
