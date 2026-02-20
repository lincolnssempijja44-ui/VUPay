
package vu.vupay;

   import java.util.Scanner;

public class VUPay {

    // Inner class to represent a course
    static class VUCourses {
        String moduleName;
        String moduleCode;
        int tuition;

        // Constructor
        VUCourses(String moduleName, String moduleCode, int tuition) {
            this.moduleName = moduleName;
            this.moduleCode = moduleCode;
            this.tuition = tuition;
        }

        // Method to display course details
        void displayCourse() {
            System.out.println("Module: " + moduleName);
            System.out.println("Module Code: " + moduleCode);
            System.out.println("Tuition: " + tuition);
        }
    }

    public static void main(String[] args) {
        // Step 1: Create course objects
        VUCourses bsf = new VUCourses("BSc. Software Engineering", "BSF", 900000);
        VUCourses bit = new VUCourses("BSc. Information Technology", "BIT", 750000);
        VUCourses bcs = new VUCourses("BSc. Computer Science", "BCS", 800000);
        VUCourses bce = new VUCourses("BSc. Computer Engineering", "BCE", 950000);

        // Step 2: Prompt user for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Module Code (must match exactly): ");
        String inputCode = sc.nextLine(); // case-sensitive

        // Step 3: Match input with available courses
        if (inputCode.equals("BSF")) {
            bsf.displayCourse();
        } else if (inputCode.equals("BIT")) {
            bit.displayCourse();
        } else if (inputCode.equals("BCS")) {
            bcs.displayCourse();
        } else if (inputCode.equals("BCE")) {
            bce.displayCourse();
        } else {
            // Step 4: Handle wrong input
            System.out.println("Wrong Module Code details");
        }

        sc.close();
    }
}