package com.bz.day4.utility;

import com.bz.day4.enums.Cards;

public class CardUtil {

	public static void printCard(Cards cards) {

		switch (cards) {
		case BLACK_HEART:
			 printCards(getCards(cards.toString()));
			 break;
		case RED_HEART:
			printCards(getCards(cards.toString()));
			 break;
		case CLUBS:
			printCards(getCards(cards.toString()));
			 break;
		case DIAMOND:
			printCards(getCards(cards.toString()));
			 break;
		default:
			break;
		}
	}
	
	private static String[] getCards(String str) {
		String arrayOfCards[] = new String[13];
		for(int i=1;i<=13;i++) {
			arrayOfCards[i-1] = str+"_"+i;
		}
		return arrayOfCards;
	}
	
	private static void printCards(String x[]) {
		for(int i=0;i<13;i++) {
			System.out.println(x[i]);
		}
	}
}
