class DecimalToBinay {

	static String convertToBinary(int decimal){
		String binary = "";
		while(decimal>1){
			binary =(decimal % 2)+ binary;	
			decimal/=2;
		}
		return binary;
		
	}
	public static void main(String[] args){
		System.out.println(convertToBinary(args[0]));
	}
}