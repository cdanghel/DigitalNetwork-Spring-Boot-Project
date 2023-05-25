package com.example.digitalnetwork.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Controller;

@Controller
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 0;
	static {
		users.add(new User(++usersCount,"Augustus",LocalDate.now().minusYears(75)));
		users.add(new User(++usersCount,"Aurelius",LocalDate.now().minusYears(58)));
		users.add(new User(++usersCount,"Constantine",LocalDate.now().minusYears(65)));
	}
	
	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
	       Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}

	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
		
	}

}
