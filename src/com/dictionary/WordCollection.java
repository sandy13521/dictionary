package com.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WordCollection {
	Scanner sc = new Scanner(System.in);

	HashMap<String, List> dictionary = new HashMap<String, List>();

	public WordCollection() {
		// TODO Auto-generated constructor stub
	}

	public void addword() {
		int ch;
		String word;
		List<String> meaning = new ArrayList<String>();
		System.out.println("Enter the word");
		word = sc.next();
		
		do {
			System.out.println("Enter the meaning of" + word);
			String m = sc.next();
			meaning.add(m);
			System.out.println("Are there any other meaning if yes enter 1");
			ch = sc.nextInt();
		} while (ch == 1);
		
		dictionary.putIfAbsent(word, meaning);
	}
}
