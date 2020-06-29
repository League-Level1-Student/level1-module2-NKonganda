package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		 System.out.println(spongebob.getName());
		 spongebob.laugh();
		 spongebob.eat();
		 System.out.println(patrick.getName());
		 patrick.laugh();
		 patrick.eat();
		 System.out.println(squidward.getName());
		 squidward.laugh();
		 squidward.eat();
	}
}
