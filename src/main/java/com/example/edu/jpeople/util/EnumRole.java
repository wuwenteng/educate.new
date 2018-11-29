package com.example.edu.jpeople.util;

/**
 * @author ASUS
 * @date 2018/10/26
 */
public enum EnumRole {
    /**
     * student
     */
    STUDENT("学生"),
    /**
     * teacher
     */
    TEACHER("教师"),
    /**
     * manager 教务人员
     */
    MANAGER("教务人员");

    EnumRole(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
