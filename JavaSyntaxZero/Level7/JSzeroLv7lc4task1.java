package JavaSyntaxZero.Level7;

public class JSzeroLv7lc4task1 {
    public String firstName;
    public String lastName;

    public JSzeroLv7lc4task1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
