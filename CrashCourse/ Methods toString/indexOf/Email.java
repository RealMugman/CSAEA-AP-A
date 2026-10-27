package indexOf;

public class Email {
    private String address;

    public Email(String address) {
        this.address = address;
    }

    public String toString() {
        return address;
    }
    public int getAtIndex() {
        return address.indexOf("@");
    }
    public String getUser() {
        return "User";
    }
    public String getDomain() {
        return ".com";
    }
    public boolean isSchool() {
        return false;
    }
}