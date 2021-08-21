class Adding:
    def __init__(self, a, b, ):
        self.a = a
        self.b = b

    def __add__(self, other):
        return self.a + self.b

    def __len__(self):
        return len(self.a)

    def __str__(self):
        return f"add"


x = Adding(8, 7)
y = Adding(9, 6)
print(x + y)

