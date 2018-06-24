package com.company;

public class ReportCard
{
    static String studentName = "Jerry Lee";

    public static char convertGrades(int testResults)
    {
        char grade;

        if(testResults >= 90)
        {
            grade = 'A';
        }
        else if (testResults >=80 && testResults < 90)
        {
            grade = 'B';
        }
        else if (testResults > 70 && testResults < 80)
        {
            grade = 'C';
        }
        else {
            grade = 'D';
        }
        return grade;
    }
    public static void main(String[] args)
    {
        char yourGrade = ReportCard.convertGrades(97);
        switch(yourGrade){

            case 'A':
                System.out.println("Good Job " + studentName);
                break;

            case 'B':
                System.out.println("Why no A?! " + studentName);
                break;

            case 'C':
                System.out.println("Hide your grades " + studentName);
                break;

            case 'D':
                System.out.println("Find a new home! " + studentName);
                break;
        }
    }


}

