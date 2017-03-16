package kr.or.dgit.mybatis_dev_teacher.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev_teacher.dto.Course;

public interface CourseMapper {
	List<Course> searchCourse(Map<String, Object> param);
	List<Course> searchChooseCourse(Map<String, Object> param);
	List<Course> searchWhereCourse(Map<String, Object> param);
	List<Course> searchTrimCourse(Map<String, Object> param);
	List<Course> searchForeachCourse(Map<String, Object> param);
}
