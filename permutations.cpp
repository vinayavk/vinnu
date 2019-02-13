#include<iostream>
#include<string.h>
using namespace std;
int a[10];
char x[10];
int check(int n)
{
    int x,z;
    for(x=0;x<n;x++)
    {
        for(z=x+1;z<n;z++)
        {
            if(a[x]==a[z])
                return(0);
        }
    }
    return(1);
}
void perm(int k,int n)
{
    int i,j;
    if(k==n)
    {

        if(check(n))
        {
            for(i=0;i<n;i++)
                cout<<x[a[i]];
            cout<<endl;
        }
    }
    else
    {
        for(j=0;j<n;j++)
        {
            perm(k+1,n);
            a[k]++;

        }
    }
    a[k] = 0;
}

int main()
{
    int n;
    cin>>x;
    n = strlen(x);
    perm(0,n);

}
