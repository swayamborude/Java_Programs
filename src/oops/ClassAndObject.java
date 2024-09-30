package oops;

import java.util.Scanner;

public class ClassAndObject {
	
	private int jersey_no;
	private String name;
	private int match_played;
	private int innings;
	private int not_out;
	private int runs;
	
	public void acceptPlayer() {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter jersey_no:-");
	this.jersey_no=sc.nextInt();
	System.out.println("Enter player name:-");
	this.name=sc.next();
	System.out.println("Enter total match played:-");
	this.match_played=sc.nextInt();
	System.out.println("Enter total innings:-");
	this.innings=sc.nextInt();
	System.out.println("Enter total not out:-");
	this.not_out=sc.nextInt();
	System.out.println("Enter total runs:-");
	runs=sc.nextInt();
	
	}
		
	public void displayPlayer() {
		System.out.println("Jersey num is:-"+ this.jersey_no);
		System.out.println("Player name is:-"+ this.name);
		System.out.println("Total match played is:-"+ this.match_played);
		System.out.println("Total innings is:-"+ this.innings);
		System.out.println("Total not out is:-"+ this.not_out);
		System.out.println("Total runs is:-"+ this.runs);
	
	}
}