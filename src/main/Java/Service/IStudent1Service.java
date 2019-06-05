package Service;

import Entity.Student1;

import java.util.List;

public interface IStudent1Service {
    int deleteByPrimaryKey(Integer s_id);

    int insert(Student1 record);

    int insertSelective(Student1 record);

    Student1 selectByPrimaryKey(Integer s_id);

    List<Student1> selectByCondition(Student1 record);

    int updateByPrimaryKeySelective(Student1 record);

    int updateByPrimaryKey(Student1 record);
}