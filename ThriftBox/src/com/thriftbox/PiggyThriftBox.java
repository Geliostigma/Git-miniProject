package com.thriftbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class PiggyThriftBox {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;

		while (true) {
			
			String exit = buffer.readLine();
			if (exit.equals("сумма")) {
				break;
				
			} else {
				
				int num = Integer.parseInt(exit);
				sum += num;
				
			}
			
		}
		
		System.out.println(sum);

	}

}
