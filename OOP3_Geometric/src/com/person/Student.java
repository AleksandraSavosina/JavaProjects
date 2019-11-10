package com.person;

import java.util.Objects;

public class Student extends Person {
    private String program;
    private int year;
    private  double fee;

    public Student(String name, String adress, String program, int year, double fee) {
        super(name, adress);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[ name = " + this.getName() + ", adress = " + this.getAdress() +
                "program = " + program + ", year = " + year + ", fee = " + fee + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Student student = (Student) o;
        return year == student.year && Double.compare(student.fee, fee) == 0 &&
                program.equals(student.program);
    }

    @Override
    public int hashCode() {
        int result = 17;
    result += 31 * result + year;
    result += 31 * result + fee;
    String tmp = program;
    char[] ascii = tmp.toCharArray();
    result += 31 * result + (int)ascii[0];

        return result;
}
}
