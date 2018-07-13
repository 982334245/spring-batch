package com.batch.design.patterns.transferobject;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentBO
 * @Description TODO
 * @Author long bao
 * @Date 10:23 18/7/10
 * @Version 1.0
 */
public class StudentBO {
    /** 列表是当作一个数据库 */
    List<StudentVO> students;

    public StudentBO(){
        students = new ArrayList<StudentVO>();
        StudentVO student1 = new StudentVO("Robert",0);
        StudentVO student2 = new StudentVO("John",1);
        students.add(student1);
        students.add(student2);
    }
    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No "
                + student.getRollNo() +", deleted from database");
    }

    /** 从数据库中检索学生名单 */
    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No "
                + student.getRollNo() +", updated in the database");
    }

    @Override
    public String toString() {
        return "StudentBO{" +
                "students=" + students +
                '}';
    }
}
