import java.util.Arrays;

public class Main {

    static void rotate(int[] A) {
        // implement this function
    }

    public static void main(String[] args) {
        // Sanity check that -ea flag is enabled for 'assert'.
        try {
            assert false;
            System.out.println("Problem! Enable 'assert' with flag -ea");
            java.lang.System.exit(-1);
        } catch (java.lang.AssertionError e) { }

        // A basic test of rotate
        {
            int[] A = {7,4,12,53,32};
            int[] A_shifted = {32,7,4,12,53};
            rotate(A);
            assert Arrays.equals(A, A_shifted);
        }
        // Add three more tests here

        System.out.println("tests passed!");
    }
}


