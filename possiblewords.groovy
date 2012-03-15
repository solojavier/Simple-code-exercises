def input = '2222432503'
def words = ['']

boolean isWord(String word) {
	true
}

input.each{number->
	def tempList = []
	def values = ''

	switch(number){
		case '2': values = 'abc' ; break
		case '3': values = 'def' ; break
		case '4': values = 'ghi' ; break
		case '5': values = 'jkl' ; break
		case '6': values = 'mno' ; break
		case '7': values = 'pqrs' ; break
		case '8': values = 'tuv' ; break
		case '9': values = 'wxyz' ; break
		default: return 
	}

	values.each{letter->
		words.each{word->
			def newWord = word+letter
			if(isWord(newWord))
			tempList.add(newWord)
		}
   	}
   	words = tempList
}

println words