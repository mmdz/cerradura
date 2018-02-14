package ar.edu.unlam.pb2;

public class Cerradura2 {

	//atributos 
	private Boolean estado;
	private Integer intentosMaximos;
	private Integer claveAbreCierra;
	private Integer cantidadIntentosFallidos;
	private Boolean estaBloqueada;
	
	//constructor
	public Cerradura2(){ //sin parametros
	
		this.claveAbreCierra = 1234;  //inicializo los atributos
		this.estaBloqueada = false; //no bloqueada
		this.estado = true; //abierta
		this.cantidadIntentosFallidos = 0;
		this.intentosMaximos = 0;
	}
	
	public Cerradura2(Integer clave, Integer intentosMaxi){ //toma un nuevo valor recibido como parametro en el constructor

		this.claveAbreCierra = clave; //tomara los  valores de los parametros nuevos
		this.intentosMaximos = intentosMaxi;

		this.estaBloqueada = false;
		this.estado = true;
		this.cantidadIntentosFallidos = 0 ;
	}
	
//metodos
	public Boolean abrir(Integer clave){
		if(claveAbreCierra.equals(clave) && estaBloqueada.equals(false)){
			estado =  true;
			cantidadIntentosFallidos = 0; //resetea la cant cuando es correcta la clave
		}
		else{
			cantidadIntentosFallidos+=1; 
			if(cantidadIntentosFallidos.equals(intentosMaximos)){  //los intentos max se lo digo en el test
				estaBloqueada = true; //se bloquea
			
		
			}
			estado = false;

		}
		return this.estado;

	}
	
	public Boolean cerrar(Integer clave){
		if(claveAbreCierra.equals(clave)){
			estado = false; 
		}
		else{
			estado = true; 
		}
		
		return estado;
	}
	
	public Boolean mostrarEstado(){
		return this.estado;
	}

	
	
//creo equals y  hashcode para poder igualar objetos en el test	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidadIntentosFallidos == null) ? 0 : cantidadIntentosFallidos.hashCode());
		result = prime * result + ((claveAbreCierra == null) ? 0 : claveAbreCierra.hashCode());
		result = prime * result + ((intentosMaximos == null) ? 0 : intentosMaximos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerradura2 other = (Cerradura2) obj;
		if (cantidadIntentosFallidos == null) {
			if (other.cantidadIntentosFallidos != null)
				return false;
		} else if (!cantidadIntentosFallidos.equals(other.cantidadIntentosFallidos))
			return false;
		if (claveAbreCierra == null) {
			if (other.claveAbreCierra != null)
				return false;
		} else if (!claveAbreCierra.equals(other.claveAbreCierra))
			return false;
		if (intentosMaximos == null) {
			if (other.intentosMaximos != null)
				return false;
		} else if (!intentosMaximos.equals(other.intentosMaximos))
			return false;
		return true;
	}
	
	
	
}
