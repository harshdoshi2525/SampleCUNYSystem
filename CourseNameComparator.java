/**
 * Harsh Doshi
 * 24699722
 * doshi.harshn@gmail.com
 */

import java.util.Comparator;

public class CourseNameComparator implements Comparator<Object> {
    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    public int compare(Object o1, Object o2) {
        Course e1 = (Course) o1;
        Course e2 = (Course) o2;
        return (e1.getDepartment().compareTo(e2.getDepartment()));
    }

    /**
     * compares the numbers
     * @param left
     * @param right
     * @return
     */
        public int compareTo(Course left, Course right){
            Course s1 = (Course) left;
            Course s2 = (Course) right;
            if (s1.getDepartment() == s2.getDepartment())
                return 0;
            else if (s1.getNumber() < s2.getNumber())
                return 1;
            else
                return -1;

        }
}
