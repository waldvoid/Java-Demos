package entities;

public class Lecturer {
    int id;

    public Lecturer(int id, String firstName, String lastName, String lecturerImage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lecturerImage = lecturerImage;
    }

    String firstName;
    String lastName;
    String lecturerImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLecturerImage() {
        return lecturerImage;
    }

    public void setLecturerImage(String lecturerImage) {
        this.lecturerImage = lecturerImage;
    }


}
