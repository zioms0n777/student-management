package com.ziomson.student_management_system.Service;

import com.ziomson.student_management_system.Dto.StudentDto;
import com.ziomson.student_management_system.Model.Student;

import java.util.List;

public interface IStudentService {

    List<StudentDto> getAllStudents();

    void createStudent(StudentDto studentDto);

    StudentDto getStudentById(Long studentId);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);
}
