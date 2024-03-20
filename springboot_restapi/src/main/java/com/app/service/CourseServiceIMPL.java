package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.binding.Course;
import com.app.repoS.CourseRepository;

@Service
public class CourseServiceIMPL implements CourseService
{
	
	@Autowired
	private CourseRepository courseRepo; //This Service class method should communicate with Repository methods, 

	@Override
	public String upsert(Course course) {
		Course save = courseRepo.save(course); // upsert is nothing but insert or Delete based on primary key
		System.out.println(save);
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
    java.util.Optional<Course> findById=courseRepo.findById(cid); 
		
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Course> getallCourses() {
		return courseRepo.findAll(); // finds all the courses from the method.
		// it will return list of Entities, Findall is a predefined method so call it directly and return it
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid)) // if this condition is true it will eexecute the following condition
		{
			courseRepo.deleteById(cid);
			return "Delete Success";
		}
		else
		{
			return "No Record Found";
		}

	}
	
}

	
	


