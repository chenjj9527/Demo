package Controllers;

import Entity.Student1;
import Service.IStudent1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Student1")
public class Student1Controller {
    @Autowired
    private IStudent1Service service;

    @ResponseBody
    @RequestMapping(produces = "text/html; charset=utf-8")
    public String Get() {
        List<Student1> students = service.selectByCondition(new Student1());
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(students);
        return jsonResult;
    }
}