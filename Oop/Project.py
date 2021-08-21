# year = int(input())

def isleap(year):
    # year = int(input("NEter year"))

    if year % 4 == 0:
        if year % 100 == 0 and year % 400 == 0:
            print(bool("LEAP YEAR"))
            print("LEAP YEAR")


    else:
        print("NOT A leap Year")
        print(bool("NOT A leap Year"))


isleap(2000)
