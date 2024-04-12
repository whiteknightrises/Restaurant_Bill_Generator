package restaurant_Bill_Generator;

import java.util.Scanner;

public class Restaurant_Bill_Generator {

	static int price =0;
	static String Bill ="";

	public static void main(String[] args) {
		int choice=100;
		Scanner sc = new Scanner(System.in);
		while(choice!=0) {
		System.out.println("PLEASE SELECT THE FOLLOWING ITEMS");
		System.out.println("1.DOSA       RS 35/-\n" +
		        "2.IDLI       RS 30/-\n" +
		        "3.VADA       RS 35/-\n" +
		        "4.CHEESE     RS 40/-\n" +
		        "  DOSA\n" +
		        "5.PANNER     RS 50/-\n" +
		        "  DOSA\n" +
		        "6.POROTTA    RS 60/-\n" +
		        "7.MASALA     RS 70/-\n" +
		        "  DOSA\n" +
		        "8.ONION      RS 55/-\n" +
		        "  DOSA\n" +
		        "9.MAGGI      RS 30/-\n" +
		        "10.VEG       RS 110/-\n" +
		        "   BIRIYANI\n" +
		        "11.CHICKEN   RS 150/-\n" +
		        "   BIRIYANI\n" +
		        "12.VEG       RS 50/-\n" +
		        "   NOODLES\n" +
		        "13.EGG       RS 60/-\n" +
		        "   NOODLES"+"\n"+
		        "0. TO EXIT");
		System.out.println();
		System.out.println();
		int option= sc.nextInt();
		switch(option) {
		case 1:
			price+=35;
			Bill+="YOU ORDERED DOSA--35\n";
			break;
		case 2:
			price+=30;
			Bill+="YOU ORDERED IDLI--30\n";
			break;
		case 3:
			price+=35;
			Bill+="YOU ORDERED VADA--35\n";
			break;
		case 4:
			price+=40;
			Bill+="YOU ORDERED CHEESE DOSA--40\n";
			break;
		case 5:
			price+=50;
			Bill+="YOU ORDERED PANEER DOSA--505\n";
			break;
		case 6:
			price+=60;
			Bill+="YOU ORDERED POROTTA--60\n";
			break;
		case 7:
			price+=70;
			Bill+="YOU ORDERED MASALA DOSA--70\n";
			break;
		case 8:
			price+=55;
			Bill+="YOU ORDERED ONION DOSA--55\n";
			break;
		case 9:
			price+=30;
			Bill+="YOU ORDERED MAGGI--30\n";
			break;
		case 10:
			price+=110;
			Bill+="YOU ORDERED VEG BIRIYANI--110\n";
			break;
		case 11:
			price+=150;
			Bill+="YOU ORDERED CHICKEN BIRIYANI--150\n";
			break;
		case 12:
			price+=50;
			Bill+="YOU ORDERED VEG NOODLES--50\n";
			break;
		case 13:
			price+=60;
			Bill+="YOU ORDERED EGG NOODLES--50\n";
			break;
		default :
			choice=0;
			break;
		
		}
System.out.println(Bill);		
System.out.println("TOTAL BILL IS "+price+"/-");
		}		 



	}

}
