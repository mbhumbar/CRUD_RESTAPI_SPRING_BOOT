package com.springweb.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.demo.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
