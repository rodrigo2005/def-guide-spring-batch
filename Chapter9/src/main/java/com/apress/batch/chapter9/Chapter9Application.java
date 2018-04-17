package com.apress.batch.chapter9;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class Chapter9Application {

	public static void main(String[] args) {
		List<String> newArgs = new ArrayList<>(3);
		newArgs.add("customerFile=/data/customer.csv");
		newArgs.add("outputFile=file:/Users/mminella/Documents/IntelliJWorkspace/def-guide-spring-batch/Chapter9/target/formattedCustomers.xml");

		SpringApplication.run(Chapter9Application.class, newArgs.toArray(new String[newArgs.size()]));
	}
}
