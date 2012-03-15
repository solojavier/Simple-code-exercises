//Given two integer arrays. Find the Largest Common sub array. For example, arr1 = {1,2,3,2,3,2} arr2={2,2,3,3,4,5}, the largest common sub array is {2,2,3,3}

def a = [1,2,3,2,3,2]
def b = [2,2,3,3,4,5]
def intersection = []
int aindex = 0
int bindex = 0

a.sort()
b.sort()

while (aindex < a.size() && bindex < b.size()) {
  if (a[aindex] == b[bindex]) {
    intersection.add(a[aindex])
    aindex++
    bindex++
  }
  else if (a[aindex] < b[bindex]) {
    aindex++
  }
  else {
    bindex++
  }
}

println intersection