/**
 * Harsh Doshi
 * 24699722
 * doshi.harshn@gmail.com
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.HashMap;

import static java.util.Collections.*;

public class LunarSystem {
    private static HashMap<String, Student> database;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        database = new HashMap<>();
        System.out.println("Welcome to the Lunar System, a second place course registration system for second rate courses at a second class school.\n");
        boolean program = true;
        while (program) {
            System.out.println("Options: \n");
            System.out.println("L) Login");
            System.out.println("X) Save state and quit");
            System.out.println("Q) Quit without saving state.");
            String option = scanner.next();
            if (option.equalsIgnoreCase("L")) {
                System.out.println("Enter webid: ");
                String webID = scanner.next();
                Student webIdOfStudent = new Student(webID);
                if (webID.equalsIgnoreCase("Registrar")) {
                    boolean registrarProgram = true;
                    while (registrarProgram) {
                        System.out.println("Options");
                        System.out.println("R) Register a student");
                        System.out.println("D) De-register a student");
                        System.out.println("E) View course enrollment");
                        System.out.println("L) Logout");
                        String registrarOptions = scanner.next();
                        if (registrarOptions.equalsIgnoreCase("R")) {
                            System.out.println("Please enter a WebId for the new student: ");
                            String registrarWebid = scanner.next();
                            Student studentFromRegistrar = new Student(registrarWebid);
//                            studentFromRegistrar.setWebID(registrarWebid);
                            database.put(registrarWebid, studentFromRegistrar);
                            System.out.println("Student has been registered");
                        } else if (registrarOptions.equalsIgnoreCase("D")) {
                            System.out.println("Please enter the student's WebId:");
                            String registrarWebId = scanner.next();
                            database.remove(registrarWebId);
                            System.out.println("Student has been de-registered.");
                        } else if (registrarOptions.equalsIgnoreCase("E")) {
                            System.out.println("Please enter a course:");
                            String course = scanner.next();
                            Course newCourse = new Course();
                            System.out.println("STUDENT           SEMSESTER");
                            System.out.println("----------------------------");
                            System.out.println(newCourse.getDepartment() + "                 " + newCourse.getSemester());
                        } else if (registrarOptions.equalsIgnoreCase("L")) {
                            registrarProgram = false;
                            System.out.println("Registrar logged out");
                        }
                    }
                } else {
                    Student student = database.get(webIdOfStudent);

                    System.out.println("Welcome " + webID);
                    System.out.println("Options: ");
                    System.out.println("A) Add a class");
                    System.out.println("D) Drop a class");
                    System.out.println("C) View your classes sorted by course name/ department");
                    System.out.println("S) View your courses sorted by semester");
                    System.out.println("Please select an option: ");
                    String studentOption = scanner.next();
                    if (studentOption.equalsIgnoreCase("A")) {
                        System.out.println("Please enter a course name");
                        String courseNameEntered = scanner.next();
                        System.out.println("Please select a semester");
                        String semesterEntered = scanner.next();
                        database.put(courseNameEntered, webIdOfStudent);
                        database.put(semesterEntered, webIdOfStudent);
                        System.out.println(courseNameEntered + " added in " + semesterEntered);
                    } else if (studentOption.equalsIgnoreCase("D")) {
                        System.out.println("Please enter a course name ");
                        String courseNameEntered = scanner.next();
                        Course course = new Course();
                        database.remove(courseNameEntered, webIdOfStudent);
                        System.out.println(courseNameEntered + " dropped from " + course.getSemester());
                    } else if (studentOption.equalsIgnoreCase("C")) {
                        Course courses = new Course();
                        Course semester = new Course();
                        System.out.println("Dept.   Course     Semester");
                        System.out.println("-----------------------------");
                        sort(database.get(webID).getCourses(), new CourseNameComparator());
                        System.out.println(database.get(webID));
                        System.out.print(database.get(courses));
                        System.out.print(database.get(semester));
                    } else if (studentOption.equalsIgnoreCase("S")) {
                        Course courses = new Course();
                        Course semester = new Course();
                        System.out.println("Dept.   Course     Semester");
                        System.out.println("-----------------------------");
                        sort(database.get(webID).getCourses(), new SemesterComparator());
                        System.out.println(database.get(webID));
                        System.out.print(database.get(courses));
                        System.out.print(database.get(semester));
                    }
                }


            } else if(option.equalsIgnoreCase("X")) {
                try {
                    FileOutputStream newFile = new FileOutputStream("Lunar.ser");
                    ObjectOutputStream newObject = new ObjectOutputStream(newFile);
                    newObject.writeObject(database);
                    program = false;
                } catch (FileNotFoundException e) {
                    System.out.println("File not found error");
                } catch (IOException e) {
                    System.out.println("Error");;
                }


            }
            else if(option.equalsIgnoreCase("Q")) {
                System.exit(0);
                program = false;
                System.out.println("Good bye, please pick the right SUNY next time!");
            }
        }
    }
}

