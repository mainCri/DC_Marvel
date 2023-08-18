package cliente;

import java.util.Random;
import java.util.Scanner;

import model.service.Heroes;
import model.service.Productora;
import model.service.Villanos;
import model.service.DC.DC;
import model.service.Marvel.Marvel;

public class Launcher {

	public static void main(String[] args) {
		Productora p = null;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Si tienes preferencia por marvel ingresa (1) y si es por DC ingresa(2) : ");
		Random r = new Random();
		int i = r.nextInt(10);
		
		int entrada = s.nextInt();
		
		if(entrada == 1) {
			p = new Marvel();
		}
		if(entrada == 2) {
			p = new DC();
		}
		
		Heroes h = p.getHeroe();
		Villanos v = p.getVillanos();
		
		System.out.println(h.fraseHeroe());
		System.out.println(v.FraseVillano());
		

	}

}
