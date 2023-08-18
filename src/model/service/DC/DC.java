package model.service.DC;
import model.service.Heroes;
import model.service.Productora;
import model.service.Villanos;

public class DC implements Productora{


	public Villanos getVillanos() {
		// TODO Auto-generated method stub
		return new Darkseid();
	}

	public Heroes getHeroe() {
		// TODO Auto-generated method stub
		return new Batman();
	}

	
}
