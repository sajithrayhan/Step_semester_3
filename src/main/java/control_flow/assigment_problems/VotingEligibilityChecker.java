package control_flow.assigment_problems;

/**
 * Problem 1: Voting Eligibility Checker.
 *
 * <p>The boolean expression age >= 18 decides eligibility; a single if / else prints the result. No
 * loop is needed.
 */
public class VotingEligibilityChecker {

    private static final int VOTING_AGE = 18;

    static void checkVotingEligibility(int age) {
        boolean eligible = age >= VOTING_AGE;
        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkVotingEligibility(20);   // Eligible to vote
        checkVotingEligibility(16);   // Not eligible to vote
    }
}
