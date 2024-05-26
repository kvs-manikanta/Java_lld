package com.bms.prototypeandRegistryPattern;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(){

    }
    public IntelligentStudent(Student intelligentStudent) {
        super(intelligentStudent);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent clone()
    {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                '}';
    }
}
