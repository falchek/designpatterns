package facade.eternabuster;

public class BleysThrowsEternaBuster {

	public static void main(String args[]) {
		Feint feint = new Feint();
		FootWork footwork = new FootWork();
		ShoulderWrap wrap = new ShoulderWrap();
		
		EternaBusterFacade eternabuster = new EternaBusterFacade(feint,
			footwork,
			wrap);
		
		System.out.println("Bleys prepares to throw the EternaBuster!!");
		System.out.println("\"But Bleys, it's just Phocion Lives with an extra loop on the front!\" the audience protests");
		System.out.println("\"YOU SHUT THE FUCK UP,\" Bleys roars, \"I'LL PROTECT AMERICA!  STAY OUT OF MY WAY!!\"");
		
		eternabuster.throwEternaBuster();  

	}
}