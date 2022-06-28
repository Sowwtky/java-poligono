package jana60;

public class Quadrato implements Poligono {
	double lato;
	
	public Quadrato (double lato) throws IllegalArgumentException {
		
		valoriNegativi(lato);
		
		this.lato=lato;
	}
	
	private void valoriNegativi(double lato) throws IllegalArgumentException{
		if (lato <= 0) {
			throw new IllegalArgumentException ("Il lato non puó avere valori negativi o uguali a 0");
		}
	}
	
	
	
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		valoriNegativi(lato);
		this.lato = lato;
	}

	@Override
	public double calcolaArea() {
		return lato * 2;

	}

	@Override
	public double calcolaPerimetro() {
		return lato * 4;

	}

}
