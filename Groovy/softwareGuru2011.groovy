/**
 * @author Javier Cervantes (1.27201@gmail.com)
 *
 * Determina las letras que se necesitan para escribir los números
 * en español del cero al número recibido.
 * @param numero Número entre el 0 y el 1000
 */
def obtenerLetras = {numero->
	
	def letras = []
		
	if((numero>1000)||(numero<0)){
		println "Especifica un número mayor a cero y no mayor a mil"
		return letras
	}
	if(numero>=0){
		letras.add('c')
		letras.add('e')
		letras.add('r')
		letras.add('o')
	}
	if(numero>0){
		letras.add('u')
		letras.add('n')
	}
	if(numero>1){
		letras.add('d')
		letras.add('s')
	}
	if(numero>2){
		letras.add('t')
	}
	if(numero>3){
		letras.add('a')
	}
	if(numero>4){
		letras.add('i')
	}
	if(numero>7){
		letras.add('h')
	}
	if(numero>8){
		letras.add('v')
	}
	if(numero>9){
		letras.add('z')
	}
	if(numero>14){
		letras.add('q')
	}
	if(numero>30){
		letras.add('y')
	}
	if(numero==1000)
	{
		letras.add('m')
		letras.add('l')
	}

	return letras.sort()
}

//Para correr como script:
//groovy softwareGuru2011 {numero del 0 al 1000}
println obtenerLetras(args[0].toInteger())