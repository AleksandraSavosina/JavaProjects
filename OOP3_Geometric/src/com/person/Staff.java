package com.person;

import java.util.Objects;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String adress, String school, double pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[name = " + this.getName() + ", adress = " + this.getAdress() +
                "school = " + school + '\'' + ", pay = " + pay + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Staff staff = (Staff) o;
        return Double.compare(staff.pay, pay) == 0 && Objects.equals(school, staff.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), school, pay);
    }
}
