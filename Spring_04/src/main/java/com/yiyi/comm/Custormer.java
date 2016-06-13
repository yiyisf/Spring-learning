package com.yiyi.comm;

/**
 * Created by liuzhe on 16/6/13.
 */
public class Custormer {
    private Person person;

    public Custormer(Person person) {
        System.out.println("new一个customer");
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        System.out.println("set person");
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer person is " + person;
    }
}
