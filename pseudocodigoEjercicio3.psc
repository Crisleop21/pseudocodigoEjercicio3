Algoritmo pseudocodigoEjercicio3
	Escribir "Ingrese el numero del cual desea saber el factorial: "
	Leer N
	si N<0 Entonces
		Escribir "El numero no se puede calcular"
	SiNo
		x=1
		factorial = 1
		Mientras x<= N Hacer
			factorial = factorial*x
			x=x+1
		FinMientras
		Escribir "El factorial del numero ",N," = ",factorial
		
	FinSi
FinAlgoritmo
