package com.kindergarten.teacher.model;

public class TblTeachers
{

    private int teacherId;
    private int teacherTel;
    private String teacherPwd;
    private String teacherName;

    public TblTeachers()
    {

    }

    public TblTeachers(int teacherId,int teacherTel,String teacherPwd)
    {
        this.teacherId = teacherId;
        this.teacherTel = teacherTel;
        this.teacherPwd = teacherPwd;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherTel() {
        return teacherTel;
    }

    public void setTeacherTel(int teacherTel) {
        this.teacherTel = teacherTel;
    }

    public String getTeacherPwd() {
        return teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "TblTeachers{" +
                "teacherId=" + teacherId +
                ", teacherTel=" + teacherTel +
                ", teacherPwd='" + teacherPwd + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
