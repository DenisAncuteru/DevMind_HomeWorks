package SistemGestiuneInscrieri_V2;

public class Guest {
    private String lastName;
    private String firstName;
    private String email;
    private int phoneNumber;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Guest(String lastName, String firstName, String email, int phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Guest guestObj = (Guest) obj;
        if (this.firstName.equals(guestObj.firstName) && this.lastName.equals(guestObj.lastName) &&
                this.email.equals(guestObj.email) && this.phoneNumber == (guestObj.phoneNumber)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = this.hashCode();
        result = prime * result + ((this.lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((this.email == null) ? 0 : email.hashCode());
        result = prime * result + this.phoneNumber;

        return result;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName;
    }
}
