package VeiculosVenda;

public class Veiculo {

	private int A;
	private String andromeda;
	private String sayu;
	private String tay;
	private String modelo;
	private long chassi;
	private double ano;

	interface cores {
		default void cor() {
		}
	}

	public int getA() {
		return A;
		
	}
	
	public void setA(int A) {
		this.A = A;
	}
	
	public long getChassi() {
		return chassi;
	}
	
	public void setChassi(long chassi) {
		this.chassi = chassi;
	}
	
	public double getAno() {
		return ano;
	}
	
	public void setAno(double ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String andromeda() {
		System.out.println("Marca selecionada: Andromeda.");
		return andromeda;
	}
	
	public String sayu() {
		System.out.println("Marca selecionada: Sayu.");
		return sayu;
	}
	
	public String tay() {
		System.out.println("Marca selecionada: Taytay.");
		return tay;
	}
}
