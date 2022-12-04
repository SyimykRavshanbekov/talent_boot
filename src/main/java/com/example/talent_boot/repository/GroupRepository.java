package com.example.talent_boot.repository;

import com.example.talent_boot.model.Course;
import com.example.talent_boot.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    @Query(value = "select c from Group c where c.company.id = :companyId")
    List<Group> getAllGroup(Long companyId);
}
