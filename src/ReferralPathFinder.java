import java.util.*;


/**
 * Finds referral paths in the StudentGraph to students who have
 * previously interned at a target company.
 */
public class ReferralPathFinder {

    /**
     * Creates a new referral path finder for the given graph.
     *
     * @param graph the graph representing the network of students
     */
    public ReferralPathFinder(StudentGraph graph) {
        // Constructor
    }

    /**
     * Finds a referral path from the given starting student to any
     * student who has interned at the specified target company.
    *
     * @param start         the student initiating the referral search
     * @param targetCompany the company name being searched for
     * @return a list of students forming a path from {@code start} to a
     *         student with a matching internship; an empty list may be
     *         returned if no such path exists
     */
    public List<UniversityStudent> findReferralPath(UniversityStudent start, String targetCompany) {
        // Method signature only
        return new ArrayList<>();
    }
}
