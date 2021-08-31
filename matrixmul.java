class matri
{
public static void main(String args[])
{
int m=Integer.parseInt(args[0]);
int n=Integer.parseInt(args[1]);
int a[][]=new int[m][n]; 
int b[][]=new int[m][n]; 
int c[][]=new int[m][n]; 
int i=2;
 for(int j=0;j<m;j++)
{
 for(int k=0;k<n;k++)
{
 a[j][k]=Integer.parseInt(args[i]); 
 i++;
}
} 
for(int j=0;j<m;j++)
{
for(int k=0;k<n;k++)
{
 b[j][k]=Integer.parseInt(args[i]); 
 i++;
}
} 
for(int j=0;j<m;j++)
{
for(int k=0;k<n;k++)
{ 
 c[j][k]=0;
for(int l=0;l<m;l++)
{
 c[j][k]=c[j][k]+(a[j][l]*b[l][k]);
}
}
} 
for(int j=0;j<m;j++)
{
for(int k=0;k<n;k++)
{
System.out.print(c[j][k]);
}
System.out.println("\n");
}
}
}