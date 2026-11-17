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
        return address.substring(0, address.indexOf("@"));
    }
    public String getDomain() {
        return address.substring(address.indexOf("@") + 1);
    }
    public boolean isSchool() {
        return address.indexOf("hcvsd.org") != -1;
    }
    public String getFirstName(String address) {
        String user = getUser();
        return user.substring(0, user.indexOf("@"));
    }
    public String changeDomain(String newDomain) {
        return getUser() + "@" + newDomain;
    }
    public String getLabel() {
        if (isSchool()) {
            return "School:" + getDomain();
        }
        else {
            return "Personal:" + getDomain();
        }
    }
    
}