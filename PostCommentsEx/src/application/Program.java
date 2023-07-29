package application;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randNum = new Random();
		int likes = randNum.nextInt();
		
		Scanner kb = new Scanner(System.in);
				
		System.out.println("Creating a Post");
		System.out.print("Post title: ");
		String title = kb.nextLine();
		System.out.print("\nPost content: ");
		String cont = kb.nextLine();
		System.out.println("First Commentary: ");
		String comment1 = kb.nextLine();
		System.out.println("Second Commentary: ");
		String comment2 = kb.nextLine();
		
		Date moment = new Date();
		Post p1 = new Post(moment, title, cont, likes);
		Comment c1 = new Comment(comment1);
		Comment c2 = new Comment(comment2);
		p1.addComments(c1);
		p1.addComments(c2);
		
		System.out.println(p1.toString());
				
		kb.close();
	}

}
