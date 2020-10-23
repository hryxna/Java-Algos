a = []

v = int(input("Enter number of element u want enter in array 1 : "))

for i in range(0,v):
    a.append(int(input("Enter Number: ")))

v = int(input("Enter number of element u want enter in array 2 : "))

for i in range(0,v):
    a.append(int(input("Enter Number: ")))

a.sort()

if(len(a)%2==0):
    suma = (a[(len(a)//2)] + a[(len(a)//2)-1])/2
    print(suma)
else:
    print(a[(len(a)//2)])
