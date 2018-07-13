package com.batch.design.patterns.transferobject;

/**
 * @ClassName StudentVO
 * @Description TODO
 * @Author long bao
 * @Date 10:22 18/7/10
 * @Version 1.0
 */
public class StudentVO {
    private String name;
    private Integer rollNo;

    StudentVO(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
