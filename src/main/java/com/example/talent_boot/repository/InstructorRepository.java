package com.example.talent_boot.repository;

import com.example.talent_boot.model.Group;
import com.example.talent_boot.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    @Query(value = "select c from Instructor c where c.course.id = :courseId")
    List<Instructor> getAllInstructor(Long courseId);
}
