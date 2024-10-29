package com.ziomson.student_management_system.Mapper;

import com.ziomson.student_management_system.Dto.StudentDto;
import com.ziomson.student_management_system.Model.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student) {
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstname(),
                student.getLastname(),
                student.getEmail()
        );
        return studentDto;
    }


    public static Student mapToStudent(StudentDto studentDto) {
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstname(),
                studentDto.getLastname(),
                studentDto.getEmail()
        );
        return student;
    }
}
