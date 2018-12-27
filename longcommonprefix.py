n=int(input())
a=[]
b=[]
for i in range(n):
	temp=input()
	a.append(temp)
  
l=99
for i in range(n):
	if(l > len(a[i])):
		l=len(a[i])
for i in range(l):
	flag=0
	for j in range(n-1):
		if(a[j][i]!=a[j+1][i]):
			flag=1
	if(flag==1):
		break
	b.append(a[0][i])
b="".join(b)
print(b)
