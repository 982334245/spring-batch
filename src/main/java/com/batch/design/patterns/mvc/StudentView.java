package com.batch.design.patterns.mvc;

/**
 * @ClassName StudentView
 * @Description TODO
 * @Author long bao
 * @Date 17:16 18/7/5
 * @Version 1.0
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
