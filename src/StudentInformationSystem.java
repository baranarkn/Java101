 class Main{
     public static void main(String[] args) {
         Teacher teacher1 = new Teacher("Ufuk Çelikkan" , "1900" , "SE");
         Teacher teacher2 = new Teacher("Kaan Kurtel" , "1901" , "SE");
         Teacher teacher3 = new Teacher("Senem Kumova Metin" , "1902" , "SE");
         Teacher teacher4 = new Teacher("Kaya Oğuz" , "1903" , "CE");
         Teacher teacher5 = new Teacher("İlker Korkmaz" , "1904" , "CE");

         Course course1 = new Course("Artificial Intelligence" , "420" , "SE");
         Course course2 = new Course("Concepts of Programming Languages" , "323" , "SE");
         Course course3 = new Course("Software Specification and Design" , "321" , "SE");
         Course course4 = new Course("Introduction to Neural Networks" , "470" , "CE");

         course1.addTeacher(teacher3);
         course2.addTeacher(teacher1);
         course3.addTeacher(teacher2);
         course3.addTeacher(teacher5);

         course1.printTeacher();
         course2.printTeacher();
         course3.printTeacher();
         course4.printTeacher();
     }
}

class Teacher{
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }
}

class Course{
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
            System.out.println("Adding a teacher was successful.");
        } else{
            System.out.println(teacher.name + " not a suitable teacher for " + this.name + ".");
        }
        System.out.println("---------------------------------------------------------------");
    }

    public void printTeacher(){
        if (this.teacher != null){
            System.out.println("Teacher of course " + this.name + " : " + teacher.name);
        }
        else {
            System.out.println("The instructor of course " + this.name + " has not been appointed yet.");
        }
        System.out.println("---------------------------------------------------------------");
    }
}
