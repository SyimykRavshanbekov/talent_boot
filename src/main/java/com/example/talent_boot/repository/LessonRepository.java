package com.example.talent_boot.repository;

import com.example.talent_boot.model.Lesson;
import com.example.talent_boot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

    @Query(value = "select c from Lesson c where c.course.id = :courseId")
    List<Lesson> getAllLessons(Long courseId);
}