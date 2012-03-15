//from an array of numbers find if the sum of any 2 members exists in the array.

def array = [10,2,15,20,50,5,7,90,40,35,23,46,77]

def isSumInArray = {int pos1, int pos2 ->
	array.contains(array.get(pos1)+array.get(pos2))	
}

println isSumInArray(0,1)