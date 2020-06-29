package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handySmurf = new Smurf("Handy Smurf");
		System.out.println(handySmurf.getName());
		handySmurf.eat();
		Smurf papaSmurf = new Smurf("Papa Smurf");
		System.out.println(handySmurf.getName());
		papaSmurf.getHatColor("red");
		papaSmurf.isGirlOrBoy("boy");
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(handySmurf.getName());
		Smurfette.getHatColor("white");
		Smurfette.isGirlOrBoy("girl");
		}
	}
