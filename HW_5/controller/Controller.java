package HW_5.controller;

import java.util.Calendar;

import HW_5.model.data.Student;
import HW_5.model.data.Teacher;
import HW_5.model.service.DateService;
import HW_5.model.service.UserService;

public class Controller {

  private DateService<Student> serviceStudent = new UserService<>();

  public Student createNewStudent(String name, String lastName, Calendar birthDay, String group, String speciality,
      double meanBall) {
    return serviceStudent.createStudent(name, lastName, birthDay, group, speciality, meanBall);
  }

  private DateService<Teacher> serviceTeacher = new UserService<>();

  public Teacher createNewTeacher(String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating) {
    return serviceTeacher.createTeacher(name, lastName, birthDay, disciplines, department, rating);
  }

}