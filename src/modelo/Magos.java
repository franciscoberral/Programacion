package modelo;

public class Magos extends Personaje{
	private int poderDefensaEspecial;
	
	public Magos(String nombre, int vida, int ataque, int defensa, int poderDefensaEspecial) {
		super(nombre, vida, ataque, defensa);
		this.poderDefensaEspecial=poderDefensaEspecial;
	}

	public int getPoderDefensaEspecial() {
		return poderDefensaEspecial;
	}

	public void setPoderDefensaEspecial(int poderDefensaEspecial) {
		this.poderDefensaEspecial = poderDefensaEspecial;
	}

	@Override
	public String toString() {
		return super.toString()+" Defensa Especial= " + poderDefensaEspecial;
	}
}
