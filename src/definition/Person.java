package definition;

public class Person {
    //Declaring all the Variables , that will get used
    private String contactFirstName;
    private String contactLastName;
    private String[] contactNumber;
    private String emailOfContact;

    public Person(String contactFirstName, String contactLastName, String[] contactNumber, String emailOfContact) {
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.contactNumber = contactNumber;
        this.emailOfContact = emailOfContact;
    }
    //Creating Getters.
    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String[] getContactNumber() {
        return contactNumber;
    }

    public String getEmailOfContact() {
        return emailOfContact;
    }

    //Created Setters
    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public void setContactNumber(String[] contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmailOfContact(String emailOfContact) {
        this.emailOfContact = emailOfContact;
    }
    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return  a string representation of the object.
     */


    public String toString(){
        //System.out.println("---Here are all your contacts---");
        final StringBuffer strafe = new StringBuffer("-------- * -------- * -------- * --------\n");
        strafe.append("First Name: ").append(contactFirstName).append("\n");
        strafe.append("Last Name: ").append(contactLastName).append("\n");
        strafe.append("Contact Number(s): ");//.append("\n");
        for (int i =0 ; i<contactNumber.length ; i++){
                strafe.append((contactNumber[0] != null && i == 0 ? contactNumber[0] : "") + (contactNumber[1] != null && i == 1 ? ", " + contactNumber[1] : "") +
                        (contactNumber[2] != null && i == 2 ? ", " + contactNumber[i] : ""));

        }
        strafe.append("\nEmail Address: ").append(emailOfContact).append("\n");
        strafe.append("-------- * -------- * -------- * --------");
        return strafe.toString();

    }


}


