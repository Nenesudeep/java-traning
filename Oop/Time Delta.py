from datetime import datetime
# This Program Gives us the difference in time in seconds . And input is taken in Day Date Month Year(2013) Time(24Hr)
# and Time zone ahead in(0530) format.


def delta(d1, d2):
    f = '%a %d %b %Y %H:%M:%S %z'   # below are the meaning of these letters
    d1 = datetime.strptime(d1, f)
    d2 = datetime.strptime(d2, f)
    diff = (d2 - d1).total_seconds()
    return abs(int(diff))


for _ in range(int(input())):
    print(delta(input(), input()))

# '%z' = UTC offset in the form +HHMM or -HHMM (empty string if the the object is naive) .(empty), +0000, -0400, +1030

# '%a' = Weekday as locale’s abbreviated name. Example= Sun Mon Tue Wed..

#  

