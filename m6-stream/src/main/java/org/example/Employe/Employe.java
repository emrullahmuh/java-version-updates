package org.example.Employe;

import java.util.List;

public class Employe {
    private int empid;
    private String empname;
    private String empemail;
    private List<String> empphoneNumber;

    public Employe(int empid, String empname, String empemail, List<String> empphoneNumber) {
        this.empid = empid;
        this.empname = empname;
        this.empemail = empemail;
        this.empphoneNumber = empphoneNumber;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public String getEmpemail() {
        return empemail;
    }

    public List<String> getEmpphoneNumber() {
        return empphoneNumber;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empemail='" + empemail + '\'' +
                ", empphoneNumber=" + empphoneNumber +
                '}';
    }
}
