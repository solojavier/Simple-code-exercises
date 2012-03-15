//Write a method which transforms an integer into a binary number, no libraries using (on a whiteboard).

int decimal = 256
String binary = ''
println "Decimal: "+decimal

while(decimal!=0){
	binary = (decimal % 2) + binary
	decimal /= 2
}

println "Binary: " +binary
