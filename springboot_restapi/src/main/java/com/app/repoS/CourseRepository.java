package com.app.repoS;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.binding.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>
 {

	

}
