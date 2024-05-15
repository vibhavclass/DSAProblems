def isSorted(arr, i):
  if(i == len(arr)-1):
    return True
  if(arr[i] < arr[i+1]):
    return False
  return isSorted(arr, i+1)

arr = [8, 8, 7, 7, 2, 1]
i = 0
le = len(arr)
res = isSorted(arr, i)
print(res)