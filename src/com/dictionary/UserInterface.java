package com.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;

public class UserInterface {

	static WordCollection wc = new WordCollection();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("1.Search\n2.Add\n3.exit");
			n = sc.nextInt();
			if (n == 3)
				System.exit(0);
			if (n == 1) {
				if (wc.dictionary.isEmpty())
					System.out.println("Empty");
				else {
					String w;
					System.out.println("Enter the Name you wish to search for --->");
					w = sc.next();
					System.out.println(wc.dictionary.get(w));
				}
			} else if (n == 2) {
				int ch;
				do {
					wc.addword();
					System.out.println("Do u wish to enter another word if so enter 1");
					ch = sc.nextInt();
				} while (ch == 1);
			}
		} while (n != 0);
	}
}
