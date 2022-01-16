package modelo;

public class Guerreros extends Personaje{
	private int poderAtaqueEspecial;
	
	public Guerreros(String nombre, int vida, int ataque, int defensa, int poderAtaqueEspecial) {
		super(nombre, vida, ataque, defensa);
		this.poderAtaqueEspecial=poderAtaqueEspecial;
	}

	public int getPoderAtaqueEspecial() {
		return poderAtaqueEspecial;
	}

	public void setPoderAtaqueEspecial(int poderAtaqueEspecial) {
		this.poderAtaqueEspecial = poderAtaqueEspecial;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Ataque Especial= " + poderAtaqueEspecial;
	}
}
