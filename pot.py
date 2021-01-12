n=int(input())
if(1<=n<=10):
  ch=True
  sum=0
  for i in range(n):
    p=int(input())
    if(10<=p<=9999):
      sum+=(p//10)**(p%10)
    else:
      ch=False
      break
  if(ch and sum<=1000000000): print(sum)