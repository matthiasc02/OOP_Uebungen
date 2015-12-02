
public class DemoAppAnlage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//"" String immer im Hochkommer!!!!
		Anlage Surface = new Anlage("Surface", 1300.00, 3);
		/*
		Surface.abschreiben();
		System.out.println(Surface.getrestWert());
		*/
		
		Surface.simulate(4, 320);
		
		Anlage Surface2 = Surface.renew(400, 2);
		System.out.println(Surface2.getrestWert());
	}

}
