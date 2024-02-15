package question3;

public class CourseDriver2 {
    public static void main(String[] args) {
        
        Instructor[] instructors = {
            new Instructor("Nima", "Davarpanah", "3-2636"),
            new Instructor("John", "Doe", "3-1234")
        };

        
        Textbook[] textbooks = {
            new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall"),
            new Textbook("Introduction to Algorithms", "Dr. Seuss", "McGraw Hill")
        };

        
        Course course = new Course("CS 4800", instructors, textbooks);

        
        course.printInfo();


    }
}
