package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Кадочников Игорь Алексеевич");
        student.setGroup(215);
        student.setDate(15042023);
        System.out.println("Имя студента: " + student.getFio());
        System.out.println("Группа студента: " + student.getGroup());
        System.out.println("Дата поступления: " + student.getDate());
    }
}
