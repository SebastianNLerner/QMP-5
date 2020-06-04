 

public class Tipo {
	
	Categoria categoria;
	
	Tipo(Categoria categoria){
    this.categoria = categoria;
	}

	Categoria categoria() {
    return this.categoria;
	}
	
	Tipo ZAPATOS = new Tipo(Categoria.CALZADO);
	Tipo PANTALON = new Tipo(Categoria.PARTE_INFERIOR);
	Tipo REMERA_CORTA = new Tipo(Categoria.PARTE_SUPERIOR);
	Tipo REMERA_LARGA = new Tipo(Categoria.PARTE_SUPERIOR);
	Tipo SHORT = new Tipo(Categoria.PARTE_INFERIOR);
	Tipo CAMPERA = new Tipo(Categoria.PARTE_SUPERIOR);
	Tipo ANTEOJOS = new Tipo(Categoria.ACCESORIO);
	Tipo RELOJ = new Tipo(Categoria.ACCESORIO);
}
