package jana60;

public class Rettangolo implements Poligono {

	//variabili
	private double base;
	private double altezza;
	
	//costruttore
	public Rettangolo (double base, double altezza) throws IllegalArgumentException{
		
		valoriNegativiBase(base);
		valoriNegativiAltezza(altezza);
		
		this.base=base;
		this.altezza=altezza;
	}
	
	//metodi di validazione
	
	private void valoriNegativiBase(double base) throws IllegalArgumentException{
		if (base <= 0) {
			throw new IllegalArgumentException ("La base e/o l'altezza non possono avere valori negativi o uguali a 0");
		}
	}
	
	private void valoriNegativiAltezza(double altezza) throws IllegalArgumentException{
		if (altezza <= 0) {
			throw new IllegalArgumentException ("La base e/o l'altezza non possono avere valori negativi o uguali a 0");
		}
	}
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) throws IllegalArgumentException{
		valoriNegativiBase(base);
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		valoriNegativiAltezza(altezza);
		this.altezza = altezza;
	}

	//override
	@Override
	public double calcolaPerimetro() {
		return (base * 2) + (altezza * 2);

	}
	@Override
	public double calcolaArea() {
		return base * altezza;

	}

}


