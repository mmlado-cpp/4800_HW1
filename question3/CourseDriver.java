package question3;

public class CourseDriver {
    public static void main(String[] args) {
        
        Instructor[] instructors = {
            new Instructor("Nima", "Davarpanah", "3-2636"),
            
        };

        
        Textbook[] textbooks = {
            new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall"),
            
        };

        
        Course course = new Course("CS 4800", instructors, textbooks);

        
        course.printInfo();


    }
}
