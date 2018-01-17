package adapter.wildturkey;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("The wild turkey hisses: 'DIRTY FUCKKIN BIIIIIIRD!'");

	}

	@Override
	public void fly() {
		System.out.println("The wild turkey stumbles drunkenly!");

	}
}
