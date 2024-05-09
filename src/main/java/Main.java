public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();


        //Ting: set the 'id' with UUID in studentService.addNewStudent !
        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        //System.out.println(studentService.findById("3"));
    }
}
