package com.reportcardclass;

/**
 * Created by ISA on 20/10/2017.
 */

public class ReportCard {
    private String nameStudent = "John Smith";
    private char geographyGrade = 'A';
    private char mathGrade = 'B';
    private String chemistryGrade = "A+";
    private int physicsGrade = 96;
    private int biologyGrade = 89;
    private double historyGrade = 92.6;
    private double literatureGrade = 85.8;

    public ReportCard(String nameStudents, char geographyGrades, char mathGrades,
                      String chemistryGrades, int physicsGrades, int biologyGrades,
                      double historyGrades, double literatureGrades) {

        nameStudent = nameStudents;
        geographyGrade = geographyGrades;
        mathGrade = mathGrades;
        chemistryGrade = chemistryGrades;
        physicsGrade = physicsGrades;
        biologyGrade = biologyGrades;
        historyGrade = historyGrades;
        literatureGrade = literatureGrades;

    }

    // Name
    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String student) {
        nameStudent = student;
    }

    // Geography
    public char getGeographyGrade() {
        return geographyGrade;
    }

    public void setGeographyGrade(char grade) {
        geographyGrade = grade;
    }

    //Math
    public char getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(char grade) {
        mathGrade = grade;
    }

    //History
    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double grade) {
        historyGrade = grade;
    }

    //Literature
    public double getLiteratureGrade() {
        return literatureGrade;
    }

    public void setLiteratureGrade(double grade) {
        literatureGrade = grade;
    }

    //Biology
    public int getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(int grade) {
        biologyGrade = grade;
    }

    //Physics
    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(int grade) {
        physicsGrade = grade;
    }

    //Chemistry
    public String getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(String grade) {
        chemistryGrade = grade;
    }

    public String toString() {
        return "Name: " + nameStudent +
                "\nGeography: " + geographyGrade +
                "\nMath: " + mathGrade +
                "\nChemistry: " + chemistryGrade +
                "\nPhysics: " + physicsGrade +
                "\nBiology: " + biologyGrade +
                "\nHistory: " + historyGrade +
                "\nLiterature: " + literatureGrade;
    }
}
