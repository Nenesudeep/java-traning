class Programmer:
    company = "Microsoft"

    def __init__(self, name, product):
        self.name = name
        self.product = product

    def getDetalis(self):
        print("Name of the employee is", self.name)
        print("Product he is working on is", self.product)


sudeep = Programmer("Sudeep", "Predator")  # Object OF Name Sudeep is created
alka = Programmer("alka", "Skype")  # Another Object is created.
sudeep.getDetalis()  # Programmer.getDetails(sudeep) SO that is why self is taken as the parameter in the getDetails function
sudeep.company = "Google"  # We can change the company name outside the class also.
print(sudeep.company)
