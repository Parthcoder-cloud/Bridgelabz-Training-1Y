import java.util.ArrayList;

public class RatingsAnalyzer {
    public static void main(String[] args) {

        int[] oldRatings = {4, 5, 3, 4};

        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(4);
        newRatings.add(3);

        ArrayList<Integer> allRatings = new ArrayList<>();

        for (int r : oldRatings) {
            allRatings.add(r);
        }

        for (Integer r : newRatings) {
            if (r != null) {
                allRatings.add(r);
            }
        }

        int sum = 0;
        int count = 0;

        for (Integer r : allRatings) {
            if (r != null) {
                sum += r;
                count++;
            }
        }

        double avg = (count > 0) ? (double) sum / count : 0;

        System.out.println("Average Rating: " + avg);
    }
}