import java.util.List;
import java.util.Map;

public class Guardarropas {
	public List<Prenda> prendas;
	public Map<Prenda,ModificacionGuardarropa> cambiosPendientes;
	public Map<Prenda,ModificacionGuardarropa> cambiosRealizados;
	
	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
	}
	
	public void agregarCambioNuevo(Prenda prenda, ModificacionGuardarropa modificacion) {
		cambiosPendientes.put(prenda, modificacion);
	}
	
	public void eliminarPrenda(Prenda prenda) {
		if (prendas.remove(prenda)) {
			new PrendaInexistenteException("La prenda que intenta eliminar no se encuentra en este guardarropas");
		}
	}
	
	public void aceptarCambio(Prenda prenda, ModificacionGuardarropa modificacion) {
		cambiosPendientes.remove(prenda);
		modificacion.realizarCambio(prenda, this);
		cambiosRealizados.put(prenda, modificacion);
	}
	
	public void deshacerCambio(Prenda prenda, ModificacionGuardarropa modificacion) {
		cambiosRealizados.remove(prenda);
		modificacion.deshacerCambio(prenda, this);
		cambiosPendientes.put(prenda, modificacion);
	}
}
