package tema5clases.ejercicio01;

/**
 * Vamos a crear un programa con una clase que contendrá funciones relacionadas
 * con la cuenta corriente.
 */
public class CuentaCorriente {

	/**
	 * Atributo que tendrá el DNI.
	 */
	private String DNI = "";
	
	/**
	 * Atributo que tendrá el nombre.
	 */
	private String nombre = "";
	
	
	/**
	 * Atributo que tendrá el sueldo.
	 */
	private double sueldo;
	

	/**
	 * Constructor que tiene el DNI y el sueldo.
	 * @param DNI El DNI del usuario.
	 * @param sueldo El sueldo inicial del usuario.
	 */
	public CuentaCorriente(String DNI, float sueldo) {

		if (DNI != null && !DNI.equals(""))
			this.DNI = DNI;

		if (sueldo >= 0)
			this.sueldo = sueldo;

	}

	/**
	 * Constructor que toma como parámetro todos los atributos.
	 * @param DNI El DNI del usuario.
	 * @param nombre El nombre del usuario.
	 * @param sueldo El sueldo inicial del usuario.
	 */
	public CuentaCorriente(String DNI, String nombre, float sueldo) {

		if (DNI != null && !DNI.equals(""))
			this.DNI = DNI;

		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;

		if (sueldo >= 0)
			this.sueldo = sueldo;
	}

	/**
	 * Función que devuelve el atributo DNI
	 * @return DNI Devuelve el DNI del usuario.
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Función que devuelve el nombre del usuario.
	 * @return nombre Devuelve el nombre .
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Función que permite establecer un valor al
	 * atributo Nombre.
	 * @param nombre El nombre del usuario.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	/**
	 * Función que devuelve el sueldo del usuario.
	 * @return sueldo Devuelve el sueldo del usuario.
	 */
	public double getSueldo() {
		return sueldo;
	}

	
	/**
	 * Función que saca dinero de la cuenta corriente.
	 * @param dinero Variable donde tendrá la cantidad de dinero a sacar
	 * @return Devuelve un booleano que indica si la transacción se pudo realizar o no.
	 */
	public boolean sacarDinero(double dinero) {
		boolean transaccion = false;
		
		if(this.sueldo >= dinero) {
			this.sueldo -= dinero;
			transaccion = true;
		}
		
		return transaccion;
	}
	
	/**
	 * Función que ingresa el dinero a la cuenta.
	 * @param dinero Cantidad de dinero a ingresar
	 */
	public void ingresarDinero(double dinero) {
		if (dinero > 0) {
			this.sueldo += dinero;
		}
	}

	/**
	 * Función que muestra la información de la cuenta corriente.
	 */
	public void mostrarInformacion() {
		System.out.println("Titular: " + this.nombre);
		System.out.println("DNI: " + this.DNI);
		System.out.println("Saldo: " + this.sueldo);
	}
	
	

}
