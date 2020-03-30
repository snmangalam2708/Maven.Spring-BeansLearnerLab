package configuration;

import model.Student;
import model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){

        Student[] cArray = { new Student(1, "Ujjwal"),
                new Student(2, "Adam"),
                new Student(3, "Von"),
                new Student(4, "Dave"),
                new Student(5, "Sandeep"),
                new Student(6, "Aarti"),
                new Student(7, "Chris")
        };

        ArrayList<Student> clist = new ArrayList<>(Arrays.asList(cArray));
        return new Students(clist);
    }

    @Bean(name = "students")
    public Students previousStudents(){

            Student[] pArray = { new Student(1, "Rob"),
                    new Student(2, "Mike"),
                    new Student(3, "Dan"),
                    new Student(4, "Lossie"),
                    new Student(5, "Sian"),
                    new Student(6, "Dolio"),
                    new Student(7, "Froilan")
            };

            ArrayList<Student> plist = new ArrayList<>(Arrays.asList(pArray));
            return new Students(plist);
        }
    }

