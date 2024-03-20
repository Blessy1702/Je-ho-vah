package com.app.service;

import java.util.List;

import com.app.binding.Course;

public interface CourseService 
{
	// Courseis the input here
		public String  upsert(Course course);// upsert is a plomorphic method used for both insert and update
	    
		//This method is used to get the course based on the ID
		public Course getById(Integer cid);
		
		// Lists all the course avalable in the table
		public List<Course> getallCourses();
		
		// Method to delete the courses cid is the input here
		public String deleteById(Integer cid );
}

	


