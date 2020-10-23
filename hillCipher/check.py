j = {'a':0,'b':1,'c':2,'d':3,'e':4,'f':5,'g':6,'h':7,'i':8,'j':9,'k':10,'l':11,'m':12,'n':13,'o':14,'p':15,'q':16,'r':17,'s':18,'t':19,'u':20,'v':21,'w':22,'x':23,'y':24,'z':25}
e = {0:'a',1:'b',2:'c',3:'d',4:'e',5:'f',6:'g',7:'h',8:'i',9:'j',10:'k',11:'l',12:'m',13:'n',14:'o',15:'p',16:'q',17:'r',18:'s',19:'t',20:'u',21:'v',22:'w',23:'x',24:'y',25:'z'}
dict1 = {}
list1 = []
def check(deter):
    for i in range(26):
        if((deter * i)%26 == 1 ):
            return i
    return None

def convertkey(f):
    key = f
    if(len(key)==4):
        h = []
        invk = []
        for i in range(len(key)):
            h.append(j[key[i]])
        deter = h[0]*h[3] - h[1]*h[2]
        invd = check(deter)
        if(invd == None):
                return None
        else:
            invk.append(h[3]*invd)
            invk.append((-h[1]+26)*invd)
            invk.append((-h[2]+26)*invd)
            invk.append(h[0]*invd)
            return invk


for a in range(97,123):
    for b in range(97,123):
        for c in range(97,123):
            for d in range(97,123):
                g = convertkey(chr(a)+chr(b)+chr(c)+chr(d))
                if(g != None):
                    dict1[chr(a)+chr(b)+chr(c)+chr(d)] = g
                else:
                    list1.append(chr(a)+chr(b)+chr(c)+chr(d))

for i in dict1:
    m = open("value.txt",'a')
    m.write("{}     {} \n".format(i,dict1[i]))
    m.close()

for i in list1:
    m = open("dont.txt",'a')
    m.write("{}\n".format(i))
    m.close()
