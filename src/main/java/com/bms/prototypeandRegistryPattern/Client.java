package com.bms.prototypeandRegistryPattern;

public class Client {
    public static void fillRegistry(StudentRegistry registry) {
        Student feb23Eve22=new Student();
        feb23Eve22.setBatch("FebBatch");
        feb23Eve22.setUniversity("GITAM");

        registry.register("FebBatch",feb23Eve22);

        IntelligentStudent febIntelligent=new IntelligentStudent();
        febIntelligent.setBatch("FebBatchIntelligent");
        febIntelligent.setUniversity("GITAM");
        febIntelligent.setIq(10);

        registry.register("FebBatchIntelligent",febIntelligent);
    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student vipul = registry.get("FebBatch").clone();
        vipul.setName("Vipul");
        vipul.setAge(25);


        Student bijit = registry.get("FebBatch").clone();
        bijit.setName("Bijit");
        bijit.setAge(26);

        Student shuhail = registry.get("FebBatchIntelligent").clone();
        shuhail.setName("Shuhail");
        shuhail.setAge(26);


        IntelligentStudent intelligentStudent = (IntelligentStudent) registry.get("FebBatchIntelligent").clone();
        intelligentStudent.setIq(120);

        System.out.println(shuhail.getName());
        System.out.println(vipul.toString());
        System.out.println(intelligentStudent.toString());

    }
}
