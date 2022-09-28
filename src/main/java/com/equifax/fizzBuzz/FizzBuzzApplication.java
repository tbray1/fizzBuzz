package com.equifax.fizzBuzz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication  {


	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
		//using value from command line
		int num = 1;
		if (args.length > 0) {
			try {
				if(!args[0].equalsIgnoreCase("0"))
				 num = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Argument" + args[0] + " must be an integer.");
			}
			calculateFizzBuzz(num);
		}
	}

	public static String calculateFizzBuzz(int num) {
		boolean divisibleBy3 = (num % 3 == 0);
		boolean divisibleBy5 = (num % 5 == 0);
			if (divisibleBy3 && divisibleBy5) {
				System.out.println("FizzBuzz");
				return "FizzBuzz";
			} else if (divisibleBy3) {
				System.out.println("Fizz");
				return "Fizz";
			} else if (divisibleBy5) {
				System.out.println("Buzz");
				return "Buzz";
			}
		return null;
	}
	}