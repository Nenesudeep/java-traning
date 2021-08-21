class Vector:
    def __init__(self, vec):
        self.vec = vec

    def __str__(self):
        return f"{self.vec[0]}i + {self.vec[1]}j + {self.vec[2]}k"

    def __len__(self):  # This function is used to calculate the length of the vector
        return len(self.vec)

    def __add__(self, other, sell):
        newlist = []
        for i in range(len(self.vec)):
            newlist.append(self.vec[i] + other.vec[i] + sell.vec[i])
        return Vector(newlist)


a = Vector([1, 2, 4])  # Creating list to store values
b = Vector([2, 3, 4])
c = Vector([2, 4, 6])
print(a)
print(len(b))
if len(a) != len(b):
    print("NOT POSSIBLE ADDITION")
else:
    print(a + b)
