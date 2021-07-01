package myobj.fivedice;

import java.util.Scanner;

public class Dice {
	
	final static int DICE_COUNT = 5;
	final static int DICE_NUMBER = 6;
	
	static int[] dice = new int[DICE_COUNT];
	static int[] max_dice = new int[DICE_NUMBER];
	
	public static void roll() {
		for(int i = 0; i < DICE_COUNT; ++i) {
			dice[i] = (int)(Math.random()*DICE_NUMBER+1);
			System.out.print(" ["+dice[i]+"]");
		}
		System.out.println();
	}
	
	public static void reRoll(int i) {
		dice[i] = (int)(Math.random()*DICE_NUMBER+1);
	}
	
	public static void check() {
		int num_count = 0;
		boolean count = false;
		boolean count2 = false;
		boolean count3 = false;
		
		for(int i = 0; i<DICE_COUNT; ++i) {
			if(dice[i]==1) {
				max_dice[0]++;
			}else if(dice[i]==2) {
				max_dice[1]++;
			}else if(dice[i]==3) {
				max_dice[2]++;
			}else if(dice[i]==4) {
				max_dice[3]++;
			}else if(dice[i]==5) {
				max_dice[4]++;
			}else if(dice[i]==6) {
				max_dice[5]++;
			}
		}
		
		for(int i = 0; i < DICE_COUNT; ++i) {
				if(dice[i] < dice[i<DICE_COUNT-1 ? i+1 : i]) {
					count3 = true;
					num_count++;
				}
			}
		
		for(int i = 0; i < DICE_NUMBER; ++i) {
			if(max_dice[i] == 5) {
				System.out.println("[5다이스]");
				break;
			}
			if(max_dice[i] == 4) {
				System.out.println("[4다이스]");
				break;
			}
			if(max_dice[i] == 3) count = true;
			if(max_dice[i] == 2) count2 = true;
			
		}
		
		if(count && count2) 
			System.out.println("[풀하우스]");
		if(count3 && num_count==4)
			System.out.println("[스몰 스트레이트]");
		if(count3 && num_count==5)
			System.out.println("[라지 스트레이트]");
	}
	
	public static void new_game() {
			roll();
			check();
	}
	
}
