# Class of Calculator to find the value of cube squareRoot and Square.
class Calculator:

    def __init__(self, num):
        self.num = num

    def square(self):
        print(f"The Value of Square {self.num} is {self.num ** 2}")

    def squareRoot(self):
        print(f"The Value of Square root {self.num} is {self.num ** 0.5}")

    def cube(self):
        print(f"The Value of the Cube {self.num} is {self.num **3}")

    @staticmethod          # Static Method does not require any self parameter to pass
    def greet():
        print("HELLO THERE WELCOME")


x = Calculator(3)
x.greet()
x.square()
x.cube()
x.squareRoot()
