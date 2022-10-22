import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler o codigo de uma peca 1, o número de pecas 1, o valor unitario de cada peça 1, o
codigo de uma peça 2, o numero de pecas 2 e o valor unitario de cada peca 2. Calcule e mostre o valor a ser pago.*/
		Scanner kb = new Scanner(System.in);
		
		int pieceCode1, quantPiece1, pieceCode2, quantPiece2;
		double pricePiece1, pricePiece2;
		
		System.out.print("Type the code of the first piece: ");
		pieceCode1 = kb.nextInt();
		
		System.out.print("How many pieces of the first item have you bought: ");
		quantPiece1 = kb.nextInt();
		
		System.out.print("What is the price of the item 1: ");
		pricePiece1 = kb.nextDouble();
		
		System.out.print("Type the code of the second piece: ");
		pieceCode2 = kb.nextInt();
		
		System.out.print("How many pieces of the second item have you bought: ");
		quantPiece2 = kb.nextInt();
		
		System.out.print("What is the price of the item 2: ");
		pricePiece2 = kb.nextDouble();
		
		
		
		double totalPriceItem1 = (double) pricePiece1 * quantPiece1;
		double totalPriceItem2 =  (double) pricePiece2 *quantPiece2;
		double totalPrice = (totalPriceItem1 + totalPriceItem2);
		
		System.out.printf("TOTAL VALUE TO BE PAID OF THE FIRST ITEM: R$ %.2f%n", totalPriceItem1);
		System.out.printf("TOTAL VALUE TO BE PAID OF THE SECOND ITEM: R$ %.2f%n", totalPriceItem2);
		System.out.printf("TOTAL VALUE TO BE PAID OF BOTH THE ITEMS: R$ %.2f", totalPrice);
		kb.close();
	}
}
