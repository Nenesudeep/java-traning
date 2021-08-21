from math import atan
from math import degrees
from math import asin
from math import acos
import math            # Function Number 3
from math import sqrt  # Function Number 4

ab = int(input("Enter the value of AB \n"))
bc = int(input("Enter the value of BC \n"))
# AC is HYPOTENUSE
ac = math.sqrt(ab ** 2 + bc ** 2)  # **** calling function number 3 ****
ac = sqrt(ab ** 2 + bc ** 2)    # **** calling function number 4 ****

# We can Call the sqrt function and above are the two ways to it.

# THis line is also not required as hypotenuse in not in formula it is extra line

print("Value of Hypotenuse is", ac)

angle_ac = (degrees(atan(ab / bc)))
print("ANGLE MBC IS = ", angle_ac)
print("ANGLE ROUNDED TO NEAREST DEGREE IS \n", round(angle_ac))
# Since the angle is same as the value of angle C because the sides are same in the

bm = ac / 2
mc = ac / 2
# Now We Have the three values of BM BC AND MC
