class C2dvec:
    company = 'ENGLISH'
    salary = 10000

    def __init__(self, i, j):
        self.i = i
        self.j = j

    def __str__(self):
        return f"{self.i}i + {self.j}j"


class C3dvec(C2dvec):
    company = 'System'
    salary = 20000

    def __init__(self, i, j, k):
        super().__init__(i, j)
        self.k = k

    def __str__(self):
        return f"{self.i}i+{self.j}j+{self.k}k"


a = C2dvec(2, 3)
print(a.salary)
print(a)

b = C3dvec(1, 4, 7)
print(b.salary)
print(b)
