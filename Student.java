/**
 * Harsh Doshi
 * 24699722
 * doshi.harshn@gmail.com
 */

import java.util.List;
public class Student implements Comparable{
    private List<Course> courses;
    private String webID;
    private String students;

    /**
     * gets the web id
     * @return
     */
    public String getWebID() {return String.valueOf(webID);}

    /**
     * sets the web id
     * @param webID
     */
    public void setWebID(String webID) {this.webID = String.valueOf(Integer.parseInt(webID));}

    /**
     * gets the courses
     * @return
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * sets the courses
     * @param courses
     */
    public void setCourses(Student courses) {
        this.courses = (List<Course>) courses;
    }

    /**
     * gets the student records
     * @param stu
     */
    public Student(String stu) {
        String id = "";
        Student cou = null;
        webID = id;
        students = stu;
        courses = (List<Course>) cou;
        }

    /**
     * get the name
     * @return
     */
    public String getName(){ return students; }

    /**
     * gets the salary
     * @return
     */
    public Student getSalary() { return (Student) courses; }

    /**
     * gets the web id
     * @return
     */
    public String getId(){ return webID; }

    /**
     * sets the salary
     * @param newSalary
     */
    public void setSalary(Student newSalary) {
        courses = (List<Course>) newSalary;
        }

    /**
     * Compares two objects/ courses
      * @param o
     * @return
     */
    public int compareTo(Object o) {
        Student otherStu = (Student) o;
        if (this.courses == otherStu.courses)
            return 0;
        else if (otherStu.courses.size() > (this.courses).size())
            return 1;
        else
            return -1;
        }

    /**
     * Converts the Student records to string
     * @return
     */
    public String toString() {
        return students + ", " + courses + ", "+ webID;
        }
    }
