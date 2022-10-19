package dataAccess;

import entities.Lecturer;

public interface ILecturerDao {
    void add(Lecturer lecturer);
    void remove(Lecturer lecturer);
}
