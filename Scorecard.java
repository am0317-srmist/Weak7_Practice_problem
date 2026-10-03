public class Scorecard {
    private final boolean[] results;
    private int recorded;

    public Scorecard(int questionCount) {
        if (questionCount < 0) throw new IllegalArgumentException("Question count cannot be negative");
        results = new boolean[questionCount];
    }

    public boolean recordAnswer(boolean correct) {
        if (recorded >= results.length) return false;
        results[recorded++] = correct;
        return true;
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < recorded; i++) if (results[i]) score++;
        return score;
    }

    public int getRecordedCount() { return recorded; }

    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println("Score: " + sc.getScore());
    }
}
