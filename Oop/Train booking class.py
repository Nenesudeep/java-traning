class Train:

    def __init__(self, name, fare, seats):
        self.name = name
        self.fare = fare
        self.seats = seats

    def getStatus(self):
        print(f" Train Name {self.name} There are {self.seats} seats in it")

    def fareInfo(self):
        print(f" Fare of Train IS {self.fare}")

    def bookTicket(self):
        if (self.seats > 0):
            print(f" Your ticket has been booked and your seat number is {self.seats}")
            self.seats = self.seats - 1
        else:
            print(" Sorry Now Train Is Fully Booked")


intercity = Train("VADODARA EXPRESS", 2500, 2)
intercity = Train("Rajdhani Expess", 3000, 39)
intercity.getStatus()
intercity.fareInfo()
intercity.bookTicket()
intercity.bookTicket()
intercity.bookTicket()
intercity.getStatus()

