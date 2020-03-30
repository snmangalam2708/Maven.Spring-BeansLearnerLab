package configuration;

import model.Instructor;
import model.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors(){

        Instructor[] instructorArr = {new Instructor(1, "Issac"),
                new Instructor(2, "Kevin"),
                new Instructor(3, "David") };

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));
        return new Instructors(instructorList);
    }

    @Bean
    public Instructors tcUkInstructors(){
        Instructor[] instructorArr = { new Instructor(1, "Zoe"),
                new Instructor(2, "Hillary"),
                new Instructor(3, "Meghan") };

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));
        return new Instructors(instructorList);
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        Instructor[] instructorArr = { new Instructor(1, "Kris"),
                new Instructor(2, "Dolio"),
                new Instructor(3, "Roberto"),
                new Instructor(4, "Chris")};

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));
        return new Instructors(instructorList);
    }

}
