package be.ruiterij.vpw.morse;

public class Main {
	public static void main(String args[]){
		Morse m = new Morse();
		m.out("Test");
		Hydra h = new Hydra();

	}
}

final class Morse {
	public Morse(){
	}
	public void out(String s){
		System.out.println(s);
	}
}

final class Hydra{
}