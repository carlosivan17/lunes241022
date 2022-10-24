package POO;

public class computadora {
	//Campos/Atributos
	private String marca; 
	private int vidautil;
	private double precio;
	private int cantidadRAM;
	private int espaciodisco;
	private double frecuenciaTrabajo;
	//Metodos/Comportamiento
	     //Setters - Modificar el valor de una variable
	public void ponerMarca(String marca) {
		this.marca = marca;
	}
	public void ponerVidautil(int vidautil) {
		this.vidautil = vidautil;
	}
	public void ponerPrecio(double precio) {
		this.precio = precio;
	}
	public void ponerCantidadRAM(int cantidadRAM) {
		this.cantidadRAM = cantidadRAM;
	}
	public void ponerEspacioDisco(int espaciodisco) {
		this.espaciodisco = espaciodisco;
	}
	public void ponerFrecuenciadeTrabajo(double frecuenciaTrabajo) {
		this.frecuenciaTrabajo = frecuenciaTrabajo;
	}
	//Getters - Mostrar el valor de una variable
	public String mostrarMarca() {
		return this.marca;
	}
	public int mostrarVidautil() {
		return this.vidautil;
	}
	public double mostrarPrecio() {
		return this.precio;
	}
	public int mostrarCantidadRAM() {
		return this.cantidadRAM;
	}
	public int mostrarEspaciodisco() {
		return this.espaciodisco;
	}
	public double mostrarfrecuenciatrabajo() {
		return this.frecuenciaTrabajo;
	}

}
