rows = 5
for i in range(rows):
    ch = chr(65 + i)   # A, B, C...
    print(" " * (rows - i - 1) * 2 + " ".join([ch] * (i + 1)))
