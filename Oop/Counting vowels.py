string_input = input("Enter The String")
# ignore cases
stringA = string_input.casefold()  # Function used for lowering the cases of given string
vowels = "aeiou"


def vowel_count(string, vowels):
    # Take dictionary key as a vowel

    vowel_data = {}.fromkeys(vowels, 0)

    # The above line creates a dictionary which has vowels as key's and value set to 0 initially

    print(vowel_data)

    # To count the vowels
    for char in string:  # For each character in string we count the vowels
        if char in vowels:  # we can write "count" and "vowels" after char so it is up to us
            # Increasing count for each occurrence
            vowel_data[char] = vowel_data[char] + 1
            # The above line stores the value by checking the keys i.e vowels present in the dictionary.

    return vowel_data  # This returns us dictionary


# **** FUNCTION DEF ENDS HERE *****

print("Given String:\n ", stringA)
print("The count of vowels in the string:\n ", vowel_count(string_input, vowels))
