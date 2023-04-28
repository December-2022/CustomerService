package com.finops.CustomerService.model;

import java.util.Objects;

public class Voter {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voter voter = (Voter) o;
        return age == voter.age &&
                Objects.equals(name, voter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
