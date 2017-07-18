package com.list;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.model.Model;



public class CourseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model c = new Model(1,"java",LocalTime.of(6,5),"Yes","Introduction to Java (Video),Java Intro Assessment (Assessment)");
		Model c1 = new Model(2,"MySql",LocalTime.of(3,5),"Yes","Basic SQL Statements (Video),SQL Statements (Assessment),Joins (Video),SQL Joins (Assessment)");
		
		List<Model> model = new ArrayList<Model>();
		model.addAll(Arrays.asList(new Model[] {c,c1}));
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("1.List all courses , 2. List all active courses , 3. List all inactive courses ");
		System.out.println("Enter your Choice");
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("List of all courses");
			System.out.println(model);
			break;
		
		case 2:
			System.out.println("List of all active courses");
			System.out.println(filterList(model, isActive()));
		break;
		
		case 3:
		System.out.println(filterList(model, isInActive()));
		break;
		
			
			default:
				System.out.println("Enter valid choice");
		}
	 }

	private static List<Model> filterList(List<Model> course, Predicate<Model> predicate) {
			// TODO Auto-generated method stub
			return course.stream().filter(predicate).collect(Collectors.<Model>toList());
		}

	public static Predicate<Model> isActive(){
		return a->a.getActive().equals("Yes");
		
	}
	public static Predicate<Model> isInActive(){
		return b->b.getActive().equals("No");
		


	}

}
