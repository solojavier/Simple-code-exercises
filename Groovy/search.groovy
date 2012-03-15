//find distance between two friends (linkedin)  > BFS

def root = new Node(null,"Root",[parent:'null'])
def friend1 = new Node(root,"Friend1",[parent:'root'])
def friend2 = new Node(friend1,"Friend2",[parent:'friend1'])
def friend3 = new Node(friend2,"Friend3",[parent:'friend2'])
def friend4 = new Node(friend3,"Friend4",[parent:'friend3'])
def target = new Node(friend3,"FriendX",[parent:'friend3'])

def level = 0
def queue = [root]
def found = false
def parent = root.attribute('parent')

while(queue.size>0&&!found){

	def actual = queue.remove(0)	
	
	if(actual==target){
		found=true
	}else{
		queue.addAll(actual.children())
	}

	if(actual.attribute('parent')!=parent){
			parent=actual.attribute('parent')
			level+=1
	}
}

println "Distance from root: "+level