package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Order;
import entidades.OrderItem;
import entidades.Produtos;
import entidades.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do cliente:");
		String nome = sc.nextLine();
		System.out.print("Entre com o email:");
		String email = sc.nextLine();
		System.out.print("Data de aniversário: ");
		Date aniversario = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, aniversario);
		
		System.out.print("Qual o status do pedido: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("Qual a data do pedido: ");
		Date moment = sdf.parse(sc.next());
		
		
		Order order = new Order(moment, status, cliente);
		
		System.out.println("Quantos produtos ira comprar: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			Produtos produtos = new Produtos(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, productPrice, produtos); 

			order.addItem(orderItem);
		}	
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
