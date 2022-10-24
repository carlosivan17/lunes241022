package POO;

public class App {

	public static void main(String[] args) {
		computadora pc1 = new computadora();
		//pc1.cantidadRAM = 8;
		//pc1.espaciodisco = 1024;
		//pc1.frecuenciaTrabajo = 3.5;
		//pc1.marca = "Dell";
		//pc1.precio = 500.00;
		//pc1.vidautil = 5;
		pc1.ponerMarca("Dell");
		pc1.ponerCantidadRAM(8);
		pc1.ponerEspacioDisco(1024);
		pc1.ponerFrecuenciadeTrabajo(3.5);
		pc1.ponerPrecio(500.00);
		pc1.ponerVidautil(5);
		
		computadora pc2 = new computadora();
		//pc2.cantidadRAM = 12;
		//pc2.espaciodisco = 2048;
		//pc2.frecuenciaTrabajo = 3.9;
		//pc2.marca = "Asus";
		//pc2.precio = 980.00;
		//pc2.vidautil = 4;
		pc2.ponerCantidadRAM(12);
		pc2.ponerEspacioDisco(2048);
		pc2.ponerFrecuenciadeTrabajo(3.9);
		pc2.ponerMarca("Asus");
		pc2.ponerPrecio(980.00);
		pc2.ponerVidautil(4);
		
		computadora pc3 = new computadora();
		pc3.ponerCantidadRAM(512);
		pc3.ponerEspacioDisco(0);
		pc3.ponerFrecuenciadeTrabajo(0);
		pc3.ponerMarca("Lenovo");
		pc3.ponerPrecio(0);
		pc3.ponerVidautil(0);
		
		System.out.println("Marca de la pc1 = " + pc1.mostrarMarca());
		System.out.println("Precio de la pc1 = " + pc1.mostrarPrecio());
		System.out.println("Marca de la pc2 = " + pc2.mostrarMarca());
		System.out.println("Precio de la pc2 = " + pc2.mostrarPrecio());
		System.out.println("Marca de la pc2 = " + pc2.mostrarMarca());

	}

}
