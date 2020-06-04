import java.util.*;

public class Borrador {
	Tipo tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama = Trama.LISA;	
	
	Borrador(Tipo tipo){
		this.tipo = Objects.requireNonNull(tipo,"el tipo es obligatorio");
	}
	
	void asignarMaterial(Material material) {
		this.material = Objects.requireNonNull(material,"el material es obligatorio");
	}
	void asignarColorPrincipal(Color colorPrimario) {
		this.colorPrimario = Objects.requireNonNull(colorPrimario,"el color primario es obligatorio");
	}
	void asignarColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	void asignarTrama(Trama trama){
		this.trama = Objects.requireNonNull(trama,"la trama es obligatorio");
	}
	Prenda crearPrenda() {
		if(tipo == null || material == null || colorPrimario == null) {
			throw new Error("Hay campos sin completar");
		}
		if(colorPrimario == colorSecundario) {
			throw new Error("El color secundario debe ser distinto al primario");
		}
		return new Prenda(tipo,material,colorPrimario,colorSecundario,trama);
	}
	
}
