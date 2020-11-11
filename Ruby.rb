a,b = gets().chomp().split(' ');
a = a.to_i
b = b.to_i
if a % b == 0 || b % a == 0
    printf("Sao Multiplos\n");
else
    printf("Nao sao Multiplos\n");
end
