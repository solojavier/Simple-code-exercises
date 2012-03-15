//solution
def totalWeight = { list ->
	list.collect{it.weight}.sum() ?: 0
}

def totalValue = { list ->
	list.collect{it.value}.sum() 
}

def knapsack01 = { items ->
	def candidates = items.subsequences().findAll { list ->
		def listWeight = totalWeight(list)
		listWeight < 401
	}
	candidates.max(totalValue)
}

def knapsack02 = { items ->
        items = items.sort{it.value}.reverse()
        def list = []
        items.each{item->
                if(totalWeight(list) + item.weight < 401){
                        list.add(item)
                }
        }
        list
}

//Test

def items = [ 
        [name:"map", weight:9, value:150],
        [name:"compass", weight:13, value:35],
        [name:"water", weight:153, value:200],
        [name:"sandwich", weight:50, value:160],
        [name:"glucose", weight:15, value:60],
        [name:"tin", weight:68, value:45],
        [name:"banana", weight:27, value:60],
        [name:"apple", weight:39, value:40],
        [name:"cheese", weight:23, value:30],
        [name:"beer", weight:52, value:10],
        [name:"suntan cream", weight:11, value:70],
        [name:"camera", weight:32, value:30],
        [name:"t-shirt", weight:24, value:15],
        [name:"trousers", weight:48, value:10],
        [name:"umbrella", weight:73, value:40],
        [name:"waterproof trousers", weight:42, value:70],
        [name:"waterproof overclothes", weight:43, value:75],
        [name:"note-case", weight:22, value:80],
        [name:"sunglasses", weight:7, value:20]
]
 
def packingList = knapsack01(items)
 
println "Total Weight: ${totalWeight(packingList)}"
println "Total Value: ${totalValue(packingList)}"
packingList.each {
    printf ("  item: %-25s  weight:%3d  value:%4d\n", it.name, it.weight, it.value)
}

def packingList2 = knapsack02(items)
 
println "Total Weight: ${totalWeight(packingList2)}"
println "Total Value: ${totalValue(packingList2)}"
packingList2.each {
    printf ("  item: %-25s  weight:%3d  value:%4d\n", it.name, it.weight, it.value)
}