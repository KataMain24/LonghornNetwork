import java.io.*;
import java.util.*;

/**
 * Utility class for reading student data from an input file and
 * constructing UniversityStudent objects.
 */
public class DataParser {

    /**
     * Parses a student data file into a list of UniversityStudent
     * instances.
     *
     * @param filename the path to the input file containing student data
     * @return a list of {@code UniversityStudent} objects parsed from the file;         the list may be empty if no students are found
     * @throws IOException if the file cannot be opened or read
     */
    public static List<UniversityStudent> parseStudents(String filename) throws IOException {
        List<UniversityStudent> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Temporary fields for the "current" student block
            String name = null;
            Integer age = null;
            String gender = null;
            String major = null;
            Double gpa = null;
            List<String> roommatePreferences = new ArrayList<>();
            List<String> previousInternships = new ArrayList<>();
        return new ArrayList<>();
    }

}
