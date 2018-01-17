package facade.eternabuster;

public class EternaBusterFacade {
	Feint feint;
	FootWork footwork;
	ShoulderWrap wrap;
	
	public EternaBusterFacade(Feint feint, FootWork footwork, ShoulderWrap wrap) {
		this.feint = feint;
		this.footwork = footwork;
		this.wrap = wrap;
	}
	
	public void throwEternaBuster(){
		this.footwork.forwardStep();
		this.feint.roundTheWorldLoop();
		this.footwork.subtleOfflineStep();
		this.feint.phocionLivesLoop();
		this.wrap.throwShot();
	} 
}
