public final class NameTag {
    private final String firstName;
    private final String lastName;

    public NameTag(String fullName) {
        String[] parts = fullName.trim().split(" ", -1);
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty())
            throw new IllegalArgumentException("Enter first and last name separated by one space");
        firstName = parts[0];
        lastName = parts[1];
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {
        System.out.println(new NameTag("Maria Gomez").getNickname());
    }
}
