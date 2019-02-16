p,q=input().split()
if(p.isdigit() and q.isdigit()):
    p=int(p)
    q=int(q)
    if(q==1):
      print("1 2")
    else:
       print("1 "+str(p-q))
