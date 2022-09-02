package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();

//        Nurse doctor=context.getBean(Nurse.class);
//        doctor.assist();

//        Nurse doctor=(Nurse) context.getBean("nurse");
//        doctor.assist();

//        after implements Staff interface --comment

//        Staff staff = context.getBean(Doctor.class);
//        staff.assist();

        Doctor staff=context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());

    }
}
