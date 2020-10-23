a = input("Enter The String")

strlen = len(a)
letters = 0
words = 1
sent = 0


for i in range(0,strlen):
    if(a[i].isalpha()):
        letters += 1
    if(a[i] ==" "):
        words +=1
    if(a[i] == "?" or a[i] == "." or a[i] == "!"):
        sent += 1

l = float((letters /float(words))*100)

s = float((sent / float(words))*100)

index = int(round(0.0588*l-0.296*s-15.8))

if(index<1):
    print("Before Grade 1")
elif(index>=16):
    print("Grade 16+")
else:
    print("Grade {}".format(index))
