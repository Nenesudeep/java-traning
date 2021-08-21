class Employee:
    salary = 2000
    increment = 1.5

    @property
    def salaryAfterincr(self):
        return self.salary * self.increment

    @salaryAfterincr.setter
    def salaryAfterincr(self, sai):
        self.increment = sai / self.salary

    @staticmethod
    def giveGreeting():
        print("Hello And Welcome")


e = Employee()

e.giveGreeting()
# e.salary = 3000
print("Your Salary is ", e.salary)
e.salaryAfterincr = 50000
print("Yur Increment ", e.increment, " Times")
print(e.increment)
