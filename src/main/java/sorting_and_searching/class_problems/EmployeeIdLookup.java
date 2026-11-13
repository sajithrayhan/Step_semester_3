package sorting_and_searching.class_problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 4: Employee ID Lookup in an Unsorted Directory.
 *
 * <p>buildLookup turns the unordered list into a HashMap keyed by employee ID, so every later query
 * is a direct key access.
 *
 * <p>Why it fits: queries vastly outnumber updates, so the one-time O(n) cost of building the map
 * is repaid by fast lookups. Scanning the unsorted list would cost O(n) per query, and sorting it
 * would not help new hires that are appended.
 *
 * <p>Complexity: buildLookup is O(n) time. getDepartment is O(1) on average. The lookup needs O(n)
 * extra space to hold one entry per employee.
 */
public class EmployeeIdLookup {

    private static final String UNKNOWN = "Unknown";

    static Map<String, String> buildLookup(String[][] records) {
        Map<String, String> lookup = new HashMap<>();
        for (String[] record : records) {
            lookup.put(record[0], record[1]);
        }
        return lookup;
    }

    static String getDepartment(Map<String, String> lookup, String employeeId) {
        return lookup.getOrDefault(employeeId, UNKNOWN);
    }

    public static void main(String[] args) {
        String[][] records = {
                {"E245", "Finance"},
                {"E110", "Engineering"},
                {"E390", "Marketing"},
                {"E101", "Engineering"}
        };
        Map<String, String> lookup = buildLookup(records);
        System.out.println(getDepartment(lookup, "E390"));   // Marketing
        System.out.println(getDepartment(lookup, "E999"));   // Unknown
    }
}
