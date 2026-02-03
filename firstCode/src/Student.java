// Java Class Attributes

public class Student {
    String name;
    int age;
    int iD;
    static int totalStudents = 0;

    public Student(String name, int age, int iD) {
        this.name = name;
        this.age = age;
        this.iD = iD;
        totalStudents++;
    }

    public static void main(String[] args) {
        Student student1 = new Student("James", 22, 1);
        Student student2 = new Student("Bill", 19, 2);

        System.out.println(student1.iD +") Name: "+ student1.name +", Age: "+ student1.age);
        System.out.println(student2.iD +") Name: "+ student2.name +", Age: "+ student2.age);

        System.out.println("Total students: "+ Student.totalStudents);
    }
}
