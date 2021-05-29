package com.vivek;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vivek.entity.Account;
import com.vivek.entity.Address;
import com.vivek.entity.User;
import com.vivek.repository.AccountRepository;

@SpringBootApplication
public class FirstApplication implements CommandLineRunner {
	@Autowired
	private AccountRepository accRepo;
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setAccountname("Vivek");
		/*
		 * Address Reference
		 */
		Address add1 = new Address();
		add1.setAddressline("pitchampalayam");
		add1.setCity("tiruppur");
		add1.setCountry("india");
		account.setAddress(add1);
		
		/*
		 *  Users Set<> Reference
		 */
		Set<User> users = new HashSet<>();
		User u1 = new User();
		u1.setEmail("test@gmail.com");
		u1.setUsername("test");
		users.add(u1);
		
		User u2 = new User();
		u2.setEmail("test1@gmail.com");
		u2.setUsername("test1");
		users.add(u2);
		
		
		/*
		 * Saving Account
		 */
		account.setUsers(users);
		
		accRepo.save(account);
		
		List<Account> list =  accRepo.findAll();
		System.out.println("Result "+list);
		
		
	}

}

