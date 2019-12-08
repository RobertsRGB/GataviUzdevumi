package com.company.src.com.company;

public class Student {

    private String name;
    private String personalCode; // MAINIGAJIEM PIRMAIS BURTS IR MAZAIS !!!!


    private University university;  /// ŠĀDI MĒS PIEDEFINĒJAM STUDENTAM VĒL VIENU PAZIMI - UNIVERSITĀTI

    public Bank getBank() {
        return bank;
    }

    private Bank bank;  /// ŠĀDI MĒS PIEDEFINĒJAM STUDENTAM VĒL VIENU PAZIMI - BANKU


    // ‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚‚

          public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }


    public Bank bank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }



    /// CODE-GENERATE = GETTER & SETTER
    /// un programma uzģenerē šādu sekojošu bloku

    // ••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", personalCode='" + personalCode + '\'' +
                ", university=" + university +
                ", bank=" + bank +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    // ••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

    // VĒLREIZ CODE =>> GENERATE =>> TRING : izdrukāšanas vajadzībām

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;

        // ••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••





    }
}
