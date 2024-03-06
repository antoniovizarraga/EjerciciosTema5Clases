package tema5clases.ejercicio04;

public class Articulo {

	/**
	 * Atributo que define el nombre del artículo.
	 */
	private String nombre = "";

	/**
	 * Atributo que define el precio del artículo.
	 */
	private float precio;

	/**
	 * Atributo que define el IVA de los artículos.
	 */
	public static final float IVA = 1.21f;

	/**
	 * Atributo que define el stock de artículos disponibles.
	 */
	private int cuantosQuedan;

	/**
	 * Función constructora que inicializa los atributos pasados como parámetros.
	 * 
	 * @param nombre        El nombre del artículo
	 * @param precio        El precio del artículo
	 * @param cuantosQuedan El stock disponible del artículo
	 */
	public Articulo(String nombre, float precio, int cuantosQuedan) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;

	}

	/**
	 * Función que devuelve el nombre de un artículo.
	 * 
	 * @return Devuelve el atributo nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece un valor al atributo Nombre
	 * 
	 * @param nombre El atributo nombre pasado como parámetro.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Función que devuelve el valor del atributo Precio
	 * 
	 * @return Devuelve el atributo precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Función que establece un valor al atributo Precio
	 * 
	 * @param Atributo precio pasado como parámetro
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * Función que devuelve el stock disponible de un artículo
	 * 
	 * @return Devuelve el stock de un artículo.
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Función que establece un valro al atributo que define el stock disponible de
	 * un artículo.
	 * 
	 * @param cuantosQuedan Se le pasa como parámetro el atributo que define el
	 *                      stock.
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Función que imprime la información de un artículo.
	 */
	public String toString() {
		String cadena = "";

		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Precio: " + this.precio + "\n";
		cadena += "IVA: " + "21" + "\n";
		cadena += "Stock: " + this.cuantosQuedan + "\n";

		return cadena;
	}

	/**
	 * Función que devuelve el precio de venta al público.
	 * 
	 * @return Devuelve el precio con el IVA ya aplicado.
	 */
	public float getPVP() {
		float pvp = 0f;

		pvp = precio * IVA;

		return pvp;
	}

	/**
	 * Función que devuelve el precio de venta al público pasándole como parámetro
	 * un descuento.
	 * 
	 * @param descuento El descuento del cual se quiere rebajar el precio.
	 * @return Devuelve el precio ya rebajado y con el IVA aplicado.
	 */
	public float getPVPDescuento(float descuento) {
		float pvp = 0f;

		float descuentoOperacion = descuento / 100;

		pvp = precio * IVA;
		pvp *= descuentoOperacion;

		return pvp;
	}

	/**
	 * Función que actualiza los atributos cuando un artículo es vendido.
	 * @param cantidadVendida Stock de cuántas unidades se vende de cada artículo.
	 * @return Devuelve true o false si se pudo hacer la actualización o no.
	 */
	public boolean vender(int cantidadVendida) {
		boolean transaccion = false;

		if (cuantosQuedan >= cantidadVendida) {
			this.cuantosQuedan -= cantidadVendida;
			transaccion = true;
		}

		return transaccion;
	}
	
	/**
	 * Función que establece cuántas unidades de x artículo se van a almacenar.
	 * @param cantidadAlmacenada Stock de cuántas unidades van a ser almacenadas.
	 */
	public void almacenar(int cantidadAlmacenada) {
		this.cuantosQuedan += cantidadAlmacenada;
	}
	
	
}
