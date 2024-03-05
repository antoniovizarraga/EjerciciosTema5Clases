package tema5clases.ejercicio02;

public class Libro {

	/**
	 * Variable que tendrá el título de cada libro.
	 */
	private String titulo = "";

	/**
	 * Variable que tendrá el autor de cada obra.
	 */
	private String autor = "";

	/**
	 * Campo en el que se indica la cantidad de ejemplares que hay del libro
	 */
	private int ejemplares;

	/**
	 * Un campo en el que se indica la cantidad de ejemplares ya prestados.
	 */
	private int ejemplaresPrestados;

	/**
	 * Función constructor vacío
	 */
	public Libro() {

	}

	/**
	 * Función constructor que define como parámetros todos los atributos.
	 * 
	 * @param titulo              El título del libro u obra
	 * @param autor               El nombre del autor de la obra
	 * @param ejemplares          El número de ejemplares de una obra
	 * @param ejemplaresPrestados El número de ejemplares prestados de una obra
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}

		if (ejemplares != 0) {
			this.ejemplares = ejemplares;
		}

		if (ejemplaresPrestados != 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		if (ejemplares != 0) {
			this.ejemplares = ejemplares;
		}
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		if (ejemplaresPrestados != 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}
	
	public boolean prestamo(int cantidadPrestada) {
		boolean transaccion = false;
		
		if(this.ejemplares >= cantidadPrestada) {
			this.ejemplares -= cantidadPrestada;
			this.ejemplaresPrestados += cantidadPrestada;
			transaccion = true;
		}
		
		return transaccion;
	}

}
