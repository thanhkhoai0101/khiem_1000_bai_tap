package com.example.khiem_1000_bai_tap.mang_hoc_sinh;

public class Student {

    private String name;
    private float math;
    private float literary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getLiterary() {
        return literary;
    }

    public void setLiterary(float literary) {
        this.literary = literary;
    }

    public float getAvg() {
        return (this.math + this.literary ) / 2;
    }
}
