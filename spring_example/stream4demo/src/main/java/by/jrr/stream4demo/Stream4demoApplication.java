package by.jrr.stream4demo;

import by.jrr.stream4demo.bean.Administrator;
import by.jrr.stream4demo.bean.User;
import by.jrr.stream4demo.service.AdministratorService;
import by.jrr.stream4demo.service.UserService;
import by.jrr.stream4demo.test.UserServiceTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Stream4demoApplication {
	static UserService userService = new UserService();

	public static void main(String[] args) {
//		UserServiceTest userServiceTest = new UserServiceTest();
//		userServiceTest.isUserUnder18Test();
//
//		Administrator administrator = new Administrator();
//		administrator.age = 18;
//
//		AdministratorService administratorService = new AdministratorService();
//		administratorService.isUserUnder18(administrator);

		List<User> userList = userService.produceUsers(20);
//
//		for (User user : userList) {
//			System.out.println("user = " + user);
//
//		}

		userList.stream().forEach(System.out::println);

//		SpringApplication.run(Stream4demoApplication.class, args);
	}

}
