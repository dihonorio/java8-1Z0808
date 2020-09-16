package main;

import java.util.ArrayList;

public class Question014 {
	public static void main(String[] args) {
		//short[] args = new short[] { 50, 50 }; // cannot override args
		short[] argss = new short[] { 50, 50 };
		argss[0] = 5;
		argss[1] = 10;
		System.out.println("[" + argss[0] + ", " + argss[1] + "]");
	}
}