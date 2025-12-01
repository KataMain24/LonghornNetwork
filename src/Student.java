import java.util.*;

/**
 * Abstract base class representing a generic student in the Longhorn
 * Network.
 */
public abstract class Student {

    /**
     * The student's full name.
     */
    protected String name;

    /**
     * The student's age in years.
     */
    protected int age;

    /**
     * The student's gender as a free-form string.
     */
    protected String gender;

    /**
     * The student's academic year (e.g., 1 = freshman, 2 = sophomore).
     */
    protected int year;

    /**
     * The student's major field of study.
     */
    protected String major;

    /**
     * The student's grade-point average.
     */
    protected double gpa;

    /**
     * Ordered list of preferred roommates, typically containing the
     * names of other students.
     */
    protected List<String> roommatePreferences;

    /**
     * List of company names where the student has previously interned.
     * These are used for referral path finding.
     */
    protected List<String> previousInternships;

    /**
     * Computes a numeric measure of "connection strength" between this
     * student and another.
     *
     * @param other another student in the network
     * @return an integer score representing how strongly connected         this student is to other higher values indicate         a stronger connection
     */
    public abstract int calculateConnectionStrength(Student other);
}

