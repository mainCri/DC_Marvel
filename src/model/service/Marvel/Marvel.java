package model.service.Marvel;
import model.service.Heroes;
import model.service.Productora;
import model.service.Villanos;

public class Marvel implements Productora{

	public Heroes getHeroe() {
		// TODO Auto-generated method stub
		return new Ironman();
	}

	public Villanos getVillanos() {
		// TODO Auto-generated method stub
		return new Thanos();
	}

}
