/**
 * Harsh Doshi
 * 24699722
 * doshi.harshn@gmail.com
 */

import java.util.Comparator;


public class SemesterComparator implements Comparator<Object> {
    /**
     * compares two semesters
     * @param left
     * @param right
     * @return
     */
    public int compareTo(Course left, Course right) {
        Course s1 = (Course) left;
        Course s2 = (Course) right;
        if (s1.getSemester() == s2.getSemester())
            return 0;
        else if (s1.getNumber()<s2.getNumber())
            return 1;
        else
            return -1;
    }

    @Override
    /**
     * Compares the two semesters
     */
    public int compare(Object o1, Object o2) {
        Course e1 = (Course) o1;
        Course e2 = (Course) o2;
        return (e1.getSemester().compareTo(e2.getSemester()));
    }
}
