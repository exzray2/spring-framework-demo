package com.exzray;

import com.exzray.configuration.BeanConfig;
import com.exzray.model.Doctor;
import com.exzray.model.Nurse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor);
        doctor.setQualification("Mamamia");

        Doctor doctor2 = context.getBean(Doctor.class);
        System.out.println(doctor2);

        Nurse nurse = context.getBean(Nurse.class);
        nurse.info();

//        Staff staff = context.getBean(Doctor.class);
//        staff.info();
    }

}
