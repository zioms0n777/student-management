package com.ziomson.student_management_system.Service;

import com.ziomson.student_management_system.Dto.StudentDto;
import com.ziomson.student_management_system.Mapper.StudentMapper;
import com.ziomson.student_management_system.Model.Student;
import com.ziomson.student_management_system.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
List<Student> students = studentRepository.findAll();
List<StudentDto> studentDtos = students.stream().map((student)-> StudentMapper.mapToStudentDto(student)).collect(Collectors.toList());
return studentDtos;
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        studentRepository.save(student);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
Student student = studentRepository.findById(studentId).orElseThrow(()-> new RuntimeException("Student not found"));
StudentDto studentDto = StudentMapper.mapToStudentDto(student);
return studentDto;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(StudentMapper.mapToStudent(studentDto));
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
