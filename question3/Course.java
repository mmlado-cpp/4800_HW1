package question3;


public class Course {
    private String name;
    private Instructor[] instructors;
    private Textbook[] textbooks;

    public Course(String name, Instructor[] instructors, Textbook[] textbooks) {
        this.name = name;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Textbook[] getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(Textbook[] textbooks) {
        this.textbooks = textbooks;
    }

    // Print function
    public void printInfo() {
        System.out.println("Course Name: " + name);
        
        System.out.println("Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("* " + instructor.getFirstName() + " " + instructor.getLastName());
        }
        
        System.out.println("Textbooks:");
        for (Textbook textbook : textbooks) {
            System.out.println("* " + textbook.getTitle() + " by " + textbook.getAuthor());
        }
    }

}
