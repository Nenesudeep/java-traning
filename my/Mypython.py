# Program to Print STars upside down

for i in range(5):

    for j in range(5-i):
        print("X", end=' ')

    print()

# Program to Print Right Angled Triangle side away from left

for i in range(5):

    for j in range(0, i):
        print(" ", end=' ')
    for j in range(0, 5-i):
        print("X", end=' ')
    print()

# Program to print Right angled triangle with one side towards left

for i in range(5):  # Tells us about no of rows

    for j in range(0, 5-i-1):   # Inside Loop Always for Columns:: Printing Spaces
        print(" ", end=' ')
    for j in range(0, i+1):       # Printing Stars
        print("X", end=' ')
    print()

# RHOMBUS Printing tilting towards right side.

x = int(input("Enter the now of Rows"))

for i in range(x):

    for j in range(0, x-i-1):
        print(" ", end=' ')
    for j in range(0, x+1):
        print("X", end=' ')
    print()

# PRINTING PYRAMID NORMAL ONE

for i in range(5):

    for j in range(0, 5-i-1):
        print(" ", end=' ')
    for j in range(2*i+1):
        print("X", end=' ')
    print()

# PRINTING PYRAMID UPSIDE DOWN

for i in range(5):

    for j in range(i):
        print(" ", end=' ')
    for j in range((2*i-1)+1):
        print("X", end=' ')
    print()
