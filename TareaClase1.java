
public class TareaClase1 {
	public TareaClase1() {}
	
	public boolean esPrimo(int numero) {

		boolean divisorEncontrado = false; 
		int divisor = 2;
		while(!divisorEncontrado && divisor<numero) {			
			if(numero % divisor == 0) 
				divisorEncontrado = true;
			
			divisor++;
		}
		
		if(!divisorEncontrado)
			return true;		
		return false;
	}
	
	public int sumaPrimosMenores50() {
		int suma = 0;
		for(int i = 50; i>=2; i--) {		
			if(esPrimo(i)) {
				suma += i;
			}
		}
		return suma;
	}

	
	public int sumaPrimeros50Primos() {
		int suma = 0;
		int cantPrimosSumados = 0;
		int numeroActual = 2;
		while(cantPrimosSumados<50) {
			if(esPrimo(numeroActual)) {
				suma+=numeroActual;
				cantPrimosSumados++;
			}
			numeroActual++;			
		}		
		return suma;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TareaClase1 tarea = new TareaClase1();
		int resultado = tarea.sumaPrimosMenores50();
		System.out.println("La suma de los primos menores a 50 es: " + resultado);
		
		resultado = tarea.sumaPrimeros50Primos();
		System.out.println("La suma de los 50 primeros primos es: " + resultado);
	}

}
