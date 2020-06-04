
public class AgregarPrenda implements ModificacionGuardarropa {
	public void deshacerCambio(Prenda prenda, Guardarropas guardarropas) {
		guardarropas.eliminarPrenda(prenda);
	}
	public void realizarCambio(Prenda prenda, Guardarropas guardarropas) {
		guardarropas.agregarPrenda(prenda);
	}

}
