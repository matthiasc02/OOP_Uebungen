
public class DemoAppMitarbeiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mitarbeiter MatthiasSeidl = new Mitarbeiter("Matthias", "Seidl", 2333.334);
		System.out.println(MatthiasSeidl.monatsAbrechnung());

		Mitarbeiter fred = new Mitarbeiter("Martin", "Fred", 10_000);
		System.out.println(fred.monatsAbrechnung());
	}

}
