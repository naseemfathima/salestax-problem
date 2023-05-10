package com.interview.makkajai;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String itemName;
		int indItemQuantity;
		boolean[] pArr;

		ShoppingCart cart1 = new ShoppingCart();

		System.out.println("Enter Number of Item Count");
		int toalItemCount = sc.nextInt();
		String[] itemStrArr = { "book", "music CD", "chocolate bar", "imported box of chocolates",
				"imported bottle of perfume", "bottle of perfume", "pack of headache pills" };
		System.out.println("Select item item name from below list: ");
		System.out.println("---------------------------------------");
		for (int i = 0; i < itemStrArr.length; i++) {
			System.out.println(i + 1 + ". " + itemStrArr[i]);
		}

		for (int item = 0; item < toalItemCount; item++) {
			System.out.println("Enter item seq number from above list");
			int itemSeq = sc.nextInt();
			switch (itemSeq) {
			case 1:
				itemName = itemStrArr[itemSeq - 1];
				pArr = processItem(itemName);
				System.out.println("Enter " + itemName + " Quantity?");
				indItemQuantity = sc.nextInt();
				cart1.addItem(new Item(indItemQuantity, itemName, new BigDecimal("12.49"), pArr[0], pArr[1]));
				break;

			case 2:
				itemName = itemStrArr[itemSeq - 1];
				System.out.println("Enter " + itemName + " Quantity?");
				indItemQuantity = sc.nextInt();
				pArr = processItem(itemName);
				cart1.addItem(new Item(indItemQuantity, itemName, new BigDecimal("14.99"), pArr[0], pArr[1]));
				break;

			case 3:
				itemName = itemStrArr[itemSeq - 1];
				System.out.println("Enter " + itemName + " Quantity?");
				indItemQuantity = sc.nextInt();
				pArr = processItem(itemName);
				cart1.addItem(new Item(indItemQuantity, itemName, new BigDecimal("0.85"), pArr[0], pArr[1]));
				break;

			case 4:
				itemName = itemStrArr[itemSeq - 1];
				System.out.println("Enter " + itemName + " Quantity?");
				indItemQuantity = sc.nextInt();
				pArr = processItem(itemName);
				cart1.addItem(new Item(indItemQuantity, itemName, new BigDecimal("11.25"), pArr[0], pArr[1]));
				break;

			case 5:
				itemName = itemStrArr[itemSeq - 1];
				System.out.println("Enter " + itemName + " Quantity?");
				indItemQuantity = sc.nextInt();
				pArr = processItem(itemName);
				cart1.addItem(new Item(indItemQuantity, itemName, new BigDecimal("27.99"), pArr[0], pArr[1]));
				break;

			case 6:
				itemName = itemStrArr[itemSeq - 1];
				System.out.println("Enter " + itemName + " Quantity?");
				indItemQuantity = sc.nextInt();
				pArr = processItem(itemName);
				cart1.addItem(new Item(indItemQuantity, itemName, new BigDecimal("18.99"), pArr[0], pArr[1]));
				break;

			case 7:
				itemName = itemStrArr[itemSeq - 1];
				System.out.println("Enter " + itemName + " Quantity?");
				indItemQuantity = sc.nextInt();
				pArr = processItem(itemName);
				cart1.addItem(new Item(indItemQuantity, itemName, new BigDecimal("9.75"), pArr[0], pArr[1]));
				break;

			default:
				System.out.println("Please enter valid input");
				break;
			}

		}
		cart1.calculateTotal();
		cart1.printReceipt();
		sc.close();

	}

	static boolean[] processItem(String itemName) {
		boolean[] processArr = new boolean[2];
		boolean isImported = itemName.contains("imported");
		processArr[0] = isImported;
		boolean isExempt = itemName.contains("medical") || itemName.contains("food") || itemName.contains("book")
				|| itemName.contains("chocolate") || itemName.contains("pills");
		processArr[1] = isExempt;
		return processArr;
	}
}