package MapperTest;

import com.cych.SpringBootMybatisApplication;
import com.cych.mapper.StudentMapper;
import com.cych.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMybatisApplication.class)
public class StudentMappeeTest {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void testFindAll(){
        List<Student> students = studentMapper.findAll();
        System.out.println(students);
    }
}
