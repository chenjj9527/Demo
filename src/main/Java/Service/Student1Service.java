package Service;

import Dao.Student1Mapper;
import Entity.Student1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student1Service implements IStudent1Service {

    @Autowired
    private Student1Mapper student1Mapper;


    public int deleteByPrimaryKey(Integer s_id) {
        return student1Mapper.deleteByPrimaryKey(s_id);
    }


    public int insert(Student1 record) {
        return student1Mapper.insert(record);
    }


    public int insertSelective(Student1 record) {
        return student1Mapper.insertSelective(record);
    }


    public Student1 selectByPrimaryKey(Integer s_id) { return student1Mapper.selectByPrimaryKey(s_id); }


    public List<Student1> selectByCondition(Student1 record) {
        return student1Mapper.selectByCondition(record);
    }


    public int updateByPrimaryKeySelective(Student1 record) {
        return student1Mapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Student1 record) {
        return student1Mapper.updateByPrimaryKey(record);
    }
}