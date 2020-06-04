import java.util.List;

public class Usuario {
	String nombre;
	List<Guardarropas> guardarropas;
	
	public void sugerirCambio(Prenda prenda, ModificacionGuardarropa cambio, Guardarropas guardarropa) {
		guardarropa.agregarCambioNuevo(prenda,cambio);
	}
	
	public void aceptarCambio(Prenda prenda, ModificacionGuardarropa cambio, Guardarropas guardarropa) {
		guardarropa.aceptarCambio(prenda,cambio);
	}
	
	public void deshacerCambio(Prenda prenda, ModificacionGuardarropa cambio, Guardarropas guardarropa) {
		guardarropa.deshacerCambio(prenda,cambio);
	}
	
	}
