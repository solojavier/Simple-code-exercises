//given a string,which is filled with either "(" or ")", for example "(())()())", write a function to check if the string is "proper". A "proper" string means if there is a "(" in the string, there should be a ")" which corresponds to the "(" in the string. For example, "))()("

String string = '(()()())()()'
int sum = 0
string.each{c->
	if(c=='('){
		sum++
	}else if(c==')'){
		sum--	
	}
	if(sum<0){
		return
	}
}

if(sum==0){
	println 'correct'
}else{
	println 'incorrect'
}