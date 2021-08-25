package com.company;

public class Insert {
    private Student[] stds;
    private int index;

    Insert(int size) {
        stds = new Student[size];

    }

    public void addStudent(Student s) {

        stds[index++] = s;
    }

    public void showAllStudent() {
        for (int i = 0; i < stds.length; i++) {
            if (stds[i] != null) {
                System.out.println("-----------------------");
                System.out.println("ID" + "\t" + "Name" + "\t" + "Faculty");
                System.out.println(stds[i].getID() + "\t" + stds[i].getname() + "\t" + stds[i].getfaculty());
            }

        }
    }

    public boolean checkid(int id) {
        boolean returning = false;
        for (int i = 0; i < stds.length; i++) {
            if (stds[i] != null) {
                if (stds[i].getID() == id) {
                    returning = true;
                }
            }
        }
        return returning;
    }

    public boolean delete(int id) {
        boolean status = false;
        for (int i = 0; i < stds.length; i++) {
            if (stds[i] != null) {
                if (stds[i].getID() == id) {
                    stds[i] = null;
                    status = true;
                }
            }
        }
        return status;

    }

    public boolean update(int id) {
        boolean updstatus = false;
        for (int i = 0; i < stds.length; i++) {
            if (stds[i] != null) {
                if (stds[i].getID() == id) {
                    updstatus = true;
                }
            }
        }
        return updstatus;

    }

    public void updatevalue(String names, String faculties) {
        for (int i = 0; i < stds.length; i++) {
            if (stds[i] != null) {
                stds[i].setname(names);
                stds[i].setfaculty(faculties);
            }
        }
    }

    public Student findStudentbyID(int id) {
        Student std = null;
        for (int i = 0; i < stds.length; i++) {
            if (stds[i] != null) {
                if (stds[i].getID() == id) {
                    std = stds[i];
                }
            }
        }
        return std;
    }

}
