package dataAccess.jdbc;

import dataAccess.ILecturerDao;
import entities.Lecturer;

public class JdbcLecturerDao implements ILecturerDao {
    @Override
    public void add(Lecturer lecturer) {
        System.out.println(lecturer.getFirstName() + " " + lecturer.getLastName() + ": Jdbc ile veritabanına eklendi");

    }

    @Override
    public void remove(Lecturer lecturer) {
        System.out.println(lecturer.getFirstName() + " " + lecturer.getLastName() + ": Jdbc ile veritabanından silindi");

    }
}
