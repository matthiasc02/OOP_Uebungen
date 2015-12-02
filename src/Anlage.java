
public class Anlage {

	private String Bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;

	public Anlage(String Bezeichnung, double initialWert, int nutzungsdauer) {
		this.Bezeichnung = Bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;

		restWert = initialWert;
		alter = 0;
	}

	public String getBezeichnug() {
		return Bezeichnung;
	}

	public double getinitialWert() {
		return initialWert;
	}

	public int getnutzungsdauer() {
		return nutzungsdauer;
	}

	public double getrestWert() {
		return restWert;
	}

	public int getalter() {
		return alter;
	}

	public void abschreiben() {
		// Vorab erhöhen, damit das Produkt auch altern kann wenn die
		// Nutzungsdauer schon erreicht ist
		alter++;
		if (alter <= nutzungsdauer) {
			restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
		}
	}

	public void simulate(int maxJahre, int minWert) {
		int i = 0;
		while (restWert > 0 && maxJahre >= i && restWert > minWert) {
			System.out.println(alter + " Jahr(e) " + restWert);
			abschreiben();
			System.out.println(alter + " Jahr(e) " + restWert);
			i++;
		}

	}

	public Anlage renew(int zusatzWert, int zusatzJahre) {
		Anlage newAnlage = new Anlage(Bezeichnung, getrestWert() + zusatzWert,
				getnutzungsdauer() - getalter() + zusatzJahre);
		return newAnlage;
	}

}
