package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * FeignClient donde conectamos con otro microservicio que está es el de estudiantes
 * @author alexander ramirez
 */
@FeignClient(name = "msvc-student", url="localhost:8080/api/student")
public interface StudentClient {
    @GetMapping("/search-by-course/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse);
}
