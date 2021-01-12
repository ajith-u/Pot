n=gets.to_i;
if(n.between?(1,10))
  ch=true
  sum=0
  n.times do
    p=gets.to_i;
    if(p.between?(10,9999))
      sum+=(p/10)**(p%10)
    else
      ch=false
      break
    end
  end
  puts sum if(ch and sum<=1000000000)
end
