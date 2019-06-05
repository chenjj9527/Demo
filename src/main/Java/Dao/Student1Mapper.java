package Dao;

import Entity.Student1;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Student1Mapper {
    int deleteByPrimaryKey(Integer s_id);

    int insert(Student1 record);

    int insertSelective(Student1 record);

    Student1 selectByPrimaryKey(Integer s_id);

    List<Student1> selectByCondition(Student1 record);

    int updateByPrimaryKeySelective(Student1 record);

    int updateByPrimaryKey(Student1 record);
}