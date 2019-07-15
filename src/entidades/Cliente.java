package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date aniversario;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String email, Date aniversario) {
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente: ");
		sb.append(nome);
		sb.append("\n");
		sb.append("E-mail: ");
		sb.append(email + "\n");
		sb.append("Data de aniversário: ");
		sb.append(sdf.format(aniversario));		
		return sb.toString();
	}		
}
