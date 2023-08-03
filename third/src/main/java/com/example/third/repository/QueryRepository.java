package com.example.third.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.third.model.Queries;

public interface QueryRepository extends JpaRepository<Queries, Long>{
    
    @Query("select * from Queries q")
    List<Queries> findAllData();

    // @Query("select q from Queries q where q.active=alse and q.designation=Manager")

    @Query("select q from Queries q where q.active=:activeState and q.designation=:designationList")
    List<Queries>finddata(@Param("activeState") String activeState,@Param("designationList") List<String> designationList);
}
