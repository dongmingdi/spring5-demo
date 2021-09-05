package com.dongmingdi.spring5.autowire;

public class Emp {
    private Dept deptAuto;

    public void test() {
        System.out.println(deptAuto);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "deptAuto=" + deptAuto +
                '}';
    }

    public void setDeptAuto(Dept deptAuto) {
        this.deptAuto = deptAuto;
    }
}
