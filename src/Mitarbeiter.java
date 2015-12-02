
public class Mitarbeiter {
	private String vorname;
	private String nachname;
	private int mitarbeiternummer;
	private double gehalt;
	private int alter;
	// zum generieren der MA Nummer, die dann übernommen wird
	private static int counter = 0;

	public Mitarbeiter(String vorname, String nachname, double gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
		counter++;
		mitarbeiternummer = counter;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	public double getGehalt() {
		return gehalt;
	}

	public int getAlter() {
		return alter;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public double monatsAbrechnung() {
		double monatsgehalt;
		double jahresgehalt;
		double steuer = 0;

		jahresgehalt = (gehalt * 12);
		jahresgehalt = jahresgehalt * 0.8;

		if (jahresgehalt > 50_000) {
			steuer = steuer + (jahresgehalt - 50_000) * 0.60;
		}
		if (jahresgehalt > 30_000) {
			double betrag = jahresgehalt - 30_000;
			if (betrag > 20_000) {
				betrag = 20_000;
				steuer = steuer + betrag * 0.45;
			}

		}

		if (jahresgehalt > 20_000) {
			double betrag = jahresgehalt - 20_000;
			if (betrag > 10_000) {
				betrag = 10_000;
				steuer = steuer + betrag * 0.32;
			}

		}
		if (jahresgehalt > 10_000) {
			double betrag = jahresgehalt - 10_000;
			if (betrag > 10_000) {
				betrag = 10_000;
				steuer = steuer + betrag * 0.20;
			}
		}

		steuer += jahresgehalt * 0.10;
		monatsgehalt = (jahresgehalt - steuer) / 12;

		return monatsgehalt;

	}

}
