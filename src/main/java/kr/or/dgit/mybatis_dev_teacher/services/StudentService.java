package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dao.StudentMapper;
import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String namespace="kr.or.dgit.mybatis_dev_teacher.dao.StudentMapper";
	
	public Student selectStudentByNoForResultMap(Student student){
		log.debug("selectStudentByNoForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoForResultMap", student);
		}
	}
	
	public Student selectStudentByNoAssociationAddress(Student student){
		log.debug("selectStudentByNoAssociationAddress()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoAssociationAddress", student);
		}
	}
	
	
	public List<Student> selectStudentByAllForResultMap(){
		log.debug("selectStudentByAllForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}
	}
	
	public Map<String, Object> selectStudentByNoForHashMap(Student student){
		log.debug("selectStudentByNoForHashMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoForHashMap", student);
		}
	}
	
	public List<Map<String, Object>> selectStudentByAllForHashMap(){
		log.debug("selectStudentByAllForHashMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace+".selectStudentByAllForHashMap");
		}
	}
	
	public Student selectStudentByNoWithAddress(Student student){
		log.debug("selectStudentByNoWithAddress()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoWithAddress", student);
		}
	}
	
	public int insertStudent(Student student){
		log.debug("insertStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace+".insertStudent", student);
			sqlSession.commit();
			return res;
		}
	}
	
	public int updateSetStudent(Student student){
		log.debug("updateSetStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res =  sqlSession.update(namespace+".updateSetStudent", student);
			sqlSession.commit();
			return res;
		}
	}
	
	public int deleteStudent(Student student){
		log.debug("deleteStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res =  sqlSession.delete(namespace+".deleteStudent", student);
			sqlSession.commit();
			return res;
		}
	}

}











