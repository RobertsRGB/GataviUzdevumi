package com.company.src.com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚  DEFINĒJAM STUDENTU VĀRDUS UN PERSONAS KODUS  ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚

        Student student1 = new Student();
        student1.setName("Roberts"); // SET ir mūsu pašu ģenerēta metode jeb funkcija
        student1.setPersonalCode("23123");

        Student student2 = new Student();
        student2.setName("Benita"); // SET ir mūsu pašu ģenerēta metode jeb funkcija
        student2.setPersonalCode("12345");

        Student student3 = new Student();
        student3.setName("Anna"); // SET ir mūsu pašu ģenerēta metode jeb funkcija
        student3.setPersonalCode("67850");

        // ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚  DEFINĒJAM UNIVERSITĀŠU  VĀRDUS UN  ADRESES  ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚

        University university1 = new University(); // University
        university1.setName("RTU"); //
        university1.setAddress("Kaļķu iela 18");

        University university2 = new University();
        university2.setName("LU"); //
        university2.setAddress("Raiņa bulv. 19");

        university1.setName("TSI"); //  šī ir PIRMĀ iespēja mainīt 1.universitātes vārdu

        // ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚  DEFINĒJAM BANKU  VĀRDUS UN REITINGUS  ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚

        Bank bank1 = new Bank(); // 1.Bankas definējums
        bank1.setName("LUMINOR"); //
        bank1.setRating(101);

        Bank bank2 = new Bank(); // 2.Bankas definējums
        bank2.setName("CITADELE"); //
        bank2.setRating(99);

        // ••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••
        // Šeit mēs savienojam studentus katru ar savu universitāti

        student1.setUniversity(university1);

        student1.getUniversity().setName("RSU"); // ŠI IR OTRĀ IESPĒJA IZMAINT Universitātei tikai vārdu.

        student2.setUniversity(university2);
        student3.setUniversity(university1);

        // ••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••
        // Šeit mēs savienojam studentus katru ar savu banku

        student1.setBank(bank2);

        student2.setBank(bank1);
        student3.setBank(bank2);

        // ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚

        // Šis ir veids , kā izdrukāt visus 3 studentus vienā masīvā

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("=======================");


        System.out.println("=======================");

        // Šis ir veids , kā izdrukāt visus 3 studentus rindā ar 1 komandu, salipnot vinus kopā

        System.out.println(Arrays.toString(new Student[]{student1, student2, student3}));

        // ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚
        // lai izdrukātu kāda studenta universitātes tikai vārdu, no Universitātes izvelk vārdu

        System.out.println("1.students mācās šajā unviersitātē : " + student1.getUniversity().getName()); // izdrukā

        System.out.println("3.students mācās šajā adresē : " + student3.getUniversity().getAddress()); // izdrukā

    }
}
