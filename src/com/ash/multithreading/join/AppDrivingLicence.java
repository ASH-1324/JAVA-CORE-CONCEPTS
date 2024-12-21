package com.ash.multithreading.join;

public class AppDrivingLicence {
    public static void main(String[] args) throws InterruptedException {
        MedicalTest medicalTest = new MedicalTest();
        medicalTest.start();
        medicalTest.join();

        TestDrive testDrive = new TestDrive();
        testDrive.start();
        testDrive.join();

        OfficerSignature officerSignature = new OfficerSignature();
        officerSignature.start();
    }
}
