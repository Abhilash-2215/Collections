import java.util.TreeSet;

public class ExamScoreRanking {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(95);
        scores.add(88);
        scores.add(92);
        scores.add(81);
        scores.add(90);

        System.out.println("Unique Scores (Ascending Order):");
        System.out.println(scores);

        System.out.println("Lowest Score: " + scores.first());
        System.out.println("Highest Score: " + scores.last());

        int givenScore = 88;

        System.out.println("Score higher than " + givenScore + ": " + scores.higher(givenScore));
        System.out.println("Score lower than " + givenScore + ": " + scores.lower(givenScore));

        System.out.println("Scores in Descending Order:");
        System.out.println(scores.descendingSet());
    }
}