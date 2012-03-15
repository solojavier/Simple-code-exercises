//Given an array of integers, list out 2 elements that add up to a given sum X

def array = [10,2,15,20,50,5,7,90,40,35,23,46,77]
def x = 55

def last = array.size()-1
def first = 0
array = array.sort()

while(first<last){
	def sum = array.getAt(first)+array.getAt(last)
	if(sum==x){
		println x+"=" + array.getAt(first) +"+"+ array.getAt(last)
		break
	}else if(sum<x){
		first++
	}else{
		last--
	}
}