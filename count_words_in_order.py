n = int(input())  
words = []        
counts = []       
for i in range(n):
    w = input().strip()
    if w in words:
        idx = words.index(w)
        counts[idx] += 1
    else:
        words.append(w)
        counts.append(1)
print(len(words))
for c in counts:
    print(c, end=" ")
