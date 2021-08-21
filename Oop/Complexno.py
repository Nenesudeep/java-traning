# (a+bi)(c+di) = (ac-bd) + (bc+ad)i
# MULTIPLICATION COMPLEX NUMBERS

class Complex:
    def __init__(self, r, i):
        self.r = r
        self.i = i

    def __add__(self, other):
        return Complex(self.r + other.r, self.i + other.i)

    def __mul__(self, other):
        mulreal = self.r * other.r - self.i * other.i

        mulimaginary = other.r * self.i + self.r * other.i

        return Complex(mulreal, mulimaginary)

    def __str__(self):
        return f"{self.r}+{self.i}i"


a = Complex(3, 2)
b = Complex(1, 7)

print(a*b)
