package Jyothi;

class Rama {
	void Sita() {
		System.out.println("Ram-sita");
	}
}
class Lakshman extends Rama {
	void Sharmila() {
		System.out.println("Lakshman-sharmila");
	}
}

class Dhasharatha extends Lakshman{
	void Kousalya() {
		System.out.println("Dhasharatha-Kousalya");
	}
}
public class Assignment58 extends Dhasharatha  {
	void Ramayana() {
		System.out.println("Characters of Ramayana");
	}
	public static void main(String[] args) {
		
		Rama r1=new Dhasharatha(); // upcasting
		r1.Sita();
		Dhasharatha d1=(Dhasharatha)r1; //downcasting
		d1.Sita();
		d1.Sharmila();
		d1.Kousalya();
		

	}

}
