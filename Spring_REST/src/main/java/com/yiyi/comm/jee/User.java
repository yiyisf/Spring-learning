package com.yiyi.comm.jee;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by liuzhe on 16/6/14.
 */
public class User {
    @Size(max = 10, min = 5)
    private String name;

    @NotNull
    @Min(20)
    private Integer age;

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



}
