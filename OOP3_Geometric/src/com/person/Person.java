package com.person;

import java.util.Objects;

public class Person {
    private String name;
    private String adress;

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person[" + "name = " + name +
                ", adress = " + adress + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return name.equals(person.name) && adress.equals(person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress);
    }
}
