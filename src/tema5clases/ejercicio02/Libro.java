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

	/**
	 * Función que devuelve el atributo Título.
	 * @return Devuelve el atributo título.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Escribe un valor en el atributo título
	 * @param titulo El valor a insertar en el atributo título
	 */
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
	}

	/**
	 * Función que devuelve el atributo Autor.
	 * @return Devuelve el atributo Autor.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Función que establece el autor de una obra.
	 * @param autor El valor que estableceremos al autor.
	 */
	public void setAutor(String autor) {
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
	}

	/**
	 * Función que devuelve cuántos ejemplares tiene un libro.
	 * @return Devuelve la cantidad de ejemplares de dicho libro.
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Función que establece los ejemplares de un libro
	 * @param ejemplares La cantidad de ejemplares que tiene un libro
	 */
	public void setEjemplares(int ejemplares) {
		if (ejemplares != 0) {
			this.ejemplares = ejemplares;
		}
	}

	/**
	 * Función que devuelve la cantidad de ejemplares prestados de un libro
	 * @return Devuelve cuántos ejemplares prestados tiene un libro.
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	/**
	 * Función que establece la cantidad de ejemplares prestados de un libro
	 * @param ejemplaresPrestados La cantidad de ejemplares que ya han sido prestados
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		if (ejemplaresPrestados != 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}
	
	/**
	 * Función que se asegura de hacer un préstamo de un libro
	 * @param cantidadPrestada Cantidad de ejemplares de un libro que va a coger prestado
	 * @return Devuelve true o false dependiendo de si el préstamo fue efectivo o no.
	 */
	public boolean prestamo(int cantidadPrestada) {
		boolean transaccion = false;
		
		if(this.ejemplares >= cantidadPrestada) {
			this.ejemplares -= cantidadPrestada;
			this.ejemplaresPrestados += cantidadPrestada;
			transaccion = true;
		}
		
		return transaccion;
	}
	
	/**
	 * Función que se asegura de hacer la devolución de un libro
	 * @param cantidadDevolvida Cantidad de libros a devolver
	 * @return Devuelve true o false dependiendo de si se hizo la devolución correctamente o no.
	 */
	public boolean devolucion(int cantidadDevolvida) {
		boolean transaccion = false;
		
		if(this.ejemplaresPrestados >= cantidadDevolvida) {
			this.ejemplaresPrestados -= cantidadDevolvida;
			this.ejemplares += cantidadDevolvida;
			transaccion = true;
		}
		
		return transaccion;
	}
	
	

}
