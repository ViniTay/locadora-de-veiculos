package VeiculosVenda;

import java.util.Scanner;

public class VeiculoPasseio extends Veiculo {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		VeiculoPasseio vep = new VeiculoPasseio();

		System.out.println("Entrar no menu (1)\nSair do menu(2)\n");

		int login = scan.nextInt();
		if (login == 1) {

			do {

				System.out.println("\nBem vindo ao menu!");

				System.out.println("\nSeleciona a marca abaixo\n");

				System.out.println("(1)Andromeda\n(2)Sayu\n(3)Taytay\n");

				int marca = scan.nextInt();

				if (marca == 1) {

					System.out.println("");

					vep.sayu();
					vep.setA(11);
					vep.setChassi(1399821672);
					vep.setAno(2020.01);
					vep.setModelo("Andromeda Cooper 2021");

					System.out.println("ID:" + vep.getA());
					System.out.println("*" + vep.getChassi() + "*");
					System.out.println("Ano: " + vep.getAno());
					System.out.println(vep.getModelo());

				} else if (marca == 2) {
					System.out.println("");

					vep.sayu();
					vep.setA(12);
					vep.setChassi(492301539);
					vep.setAno(2018.06);
					vep.setModelo("Sayu Jipe");

					System.out.println("ID:" + vep.getA());
					System.out.println("*" + vep.getChassi() + "*");
					System.out.println("Ano: " + vep.getAno());
					System.out.println(vep.getModelo());

				} else if (marca == 3) {
					System.out.println("");

					vep.sayu();
					vep.setA(13);
					vep.setChassi(562910293);
					vep.setAno(2021.03);
					vep.setModelo("Taytay HB20.2");

					System.out.println("ID:" + vep.getA());
					System.out.println("*" + vep.getChassi() + "*");
					System.out.println("Ano: " + vep.getAno());
					System.out.println(vep.getModelo());

				}

			} while (login != 2);
		} else {
			System.out.println("\nObrigado pela visita!");
		}
	}
}
