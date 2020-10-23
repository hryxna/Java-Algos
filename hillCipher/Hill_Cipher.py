d = {'a':0,'b':1,'c':2,'d':3,'e':4,'f':5,'g':6,'h':7,'i':8,'j':9,'k':10,'l':11,'m':12,'n':13,'o':14,'p':15,'q':16,'r':17,'s':18,'t':19,'u':20,'v':21,'w':22,'x':23,'y':24,'z':25}
e = {0:'a',1:'b',2:'c',3:'d',4:'e',5:'f',6:'g',7:'h',8:'i',9:'j',10:'k',11:'l',12:'m',13:'n',14:'o',15:'p',16:'q',17:'r',18:'s',19:'t',20:'u',21:'v',22:'w',23:'x',24:'y',25:'z'}

def check(deter):
    for i in range(26):
        if((deter * i)%26 == 1 ):
            return i
    return range(0,25)

def encrypt():
    h = []
    text = ""
    enct = ""
    word  = input("Enter 4 letter word for key (e.g :- hill):")
    if(len(word)==4):
        for i in word:
            h.append(d[i])
        text = input("Enter text to encypt : ")
        text = "".join(text.split())
        if(len(text)%2 == 1):
            print("Your text is not in even so at last i have add 'x' ")
            text = text + "x"
        text = text.lower()
        for i in range(0,len(text),2):
            first = h[0]*d[text[i]]+h[1]*d[text[i+1]]
            second = h[2]*d[text[i]]+h[3]*d[text[i+1]]
            first = first%26
            second = second%26
            enct = enct + e[first]+e[second]

        print("Your Encrypt text is {}".format(enct))
    else:
        print("u have enter less than 4 or more than 4 PLz Try again")

def decrypt():
    decryp = ""
    dec = []
    print('''

        1  |  2
        -------
        3  |  4
    ''')
    for i in range(1,5):
        dec.append(int(input("Enter for {} (Number) : ".format(i))))
    text = input("Enter text to Decrypt : ")
    text = text.lower()
    if(len(text)%2 == 0):
        print("Warning there will not be whitespace (space) in text")
        for i in range(0,len(text),2):
            firsL = dec[0]*d[text[i]]+dec[1]*d[text[i+1]]
            secod = dec[2]*d[text[i]]+dec[3]*d[text[i+1]]
            firsL = firsL%26
            secod = secod%26
            decryp = decryp + e[firsL]+e[secod]
        print("Text after decrypting is {}".format(decryp))
    else:
        print("Your encrypt text is incomplete")

def convertkey():
    key = input("Enter Key (4 letter word) : ")
    if(len(key)==4):
        b = []
        invk = []
        for i in range(len(key)):
            b.append(d[key[i]])
        deter = b[0]*b[3] - b[1]*b[2]
        invd = check(deter)
        if(invd == range(0,25)):
            for i in invd:
                invk.append(b[3]*i)
                invk.append((-b[1]+26)*i)
                invk.append((-b[2]+26)*i)
                invk.append(b[0]*i)
                print(invk)
                invk=[]
        else:
            invk.append(b[3]*invd)
            invk.append((-b[1]+26)*invd)
            invk.append((-b[2]+26)*invd)
            invk.append(b[0]*invd)
            print(invk)
    else:
        print("You donot enter 4 letter word")
x = True
while(x == True):
    print('''
            Do u want to encrypt or decrypt?


            1. Encrypt
            2. Decrypt
            3. Convert Encrypt key to Decrypt  key   

            Enter any other number or character to exit


    ''')
    choices = input("")


    if(choices == "1"):
        encrypt()
        convertkey()
    elif(choices == "2"):
        decrypt()
    elif(choices == "3"):
        convertkey()
    else:
        x = False
        print("Bye")
