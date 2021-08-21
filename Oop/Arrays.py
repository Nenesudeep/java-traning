from array import array

x = int(input("Enter the no of elements\n"))

arrayValues = []
for i in range(x):
    ele = int(input(f"enter the element {i}\n"))
    arrayValues.append(ele)

print(arrayValues)
