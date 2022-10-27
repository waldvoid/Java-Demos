package business;

import dataAccess.ILecturerDao;
import entities.Lecturer;
import core.logging.Logger;

public class LecturerManager{
    ILecturerDao lecturerDao;
    Logger[] loggers;

    public LecturerManager(ILecturerDao lecturerDao, Logger[] loggers) {
        this.lecturerDao = lecturerDao;
        this.loggers = loggers;
    }

    public void add(Lecturer lecturer) {
        lecturerDao.add(lecturer);
        for (Logger logger : loggers) {
            logger.log(lecturer.getFirstName() + " " + lecturer.getLastName() + " Eklendi");
        }
    }

    public void remove(Lecturer lecturer) {
        lecturerDao.remove(lecturer);
        for (Logger logger : loggers) {
            logger.log(lecturer.getFirstName() + " " + lecturer.getLastName() + " Silindi");
        }
    }
}
