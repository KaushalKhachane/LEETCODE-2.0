public class ClassConcept {

    public static void main(String[] args) {
        Student student = new Student(73, "Kaushal Khachane", 92.43f);
        // System.out.println(student.name);
        
        // for(int i = 0; i < 100000; i++){
        //     student = new Student();
        // }

        Student other = student; // same--> reference
        System.out.println(other.name); // this print the same name assigned with object student

        Student random = new Student(student);
        System.out.println(random.name);        

    }
}


class Student {
    int rollno;
    String name;
    float percentage;

    Student(){
        this (73, "Default Student", 85f);
    }

    Student(int rollno, String name, float percentage){
        this.name = name;
        this.percentage = percentage;
    }

    // this constructor take the anothe object of same class as argument as assign that object properties to this current object
    Student (Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.percentage = other.percentage;
    }

    // depricated -->
    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Onject Getting Destroyed!");
    // }
}