package dataAccess;

import entities.Lecturer;

public class HibernateLecturerDao implements ILecturerDao{
    @Override
    public void add(Lecturer lecturer) {
        System.out.println(lecturer.getFirstName() + " " + lecturer.getLastName() + ": Hibernate ile veritabanına eklendi");
    }

    @Override
    public void remove(Lecturer lecturer) {
        System.out.println(lecturer.getFirstName() + " " + lecturer.getLastName() + ": Hibernate ile veritabanından silindi");

    }
}
