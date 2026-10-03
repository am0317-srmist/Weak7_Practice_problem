public class Locker {
    private final int lockerNumber;
    private String combination;

    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combination = initialCode;
    }

    public int getLockerNumber() { return lockerNumber; }

    public boolean changeCode(String currentCode, String newCode) {
        if (combination.equals(currentCode) && newCode != null && !newCode.isEmpty()) {
            combination = newCode;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Locker locker = new Locker(101, "1234");
        System.out.println(locker.changeCode("1234", "5678") ? "success" : "rejected");
        System.out.println(locker.changeCode("0000", "9999") ? "success" : "rejected");
    }
}
