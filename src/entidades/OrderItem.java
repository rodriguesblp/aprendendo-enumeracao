package entidades;

public class OrderItem {

	private Integer quantidade;
	private Double price;
	private Produtos item;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantidade, Double price, Produtos item) {
		this.quantidade = quantidade;
		this.price = price;
		this.item = item;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Produtos getItem() {
		return item;
	}

	public void setItem(Produtos item) {
		this.item = item;
	}
	
	public double subTotal() {
		return price * quantidade;
	}	
	
	public String toString() {
		return "Item: "
				+ item.getNome() 
				+ ", "
				+ "Preço: R$ "
				+ price
				+ ", "
				+ "Quant: "
				+ quantidade
				+"Subtotal: R$ "
				+ subTotal();
	}
}
