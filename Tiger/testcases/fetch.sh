URL=http://www.computing.dcu.ie/~hamilton/teaching/CA448/testcases/

rm *.tig

for i in {1..49} 
do
    curl -O  "${URL}test${i}.tig"
       
done

for name in 'queens.tig' 'merge.tig'
do
     curl -O "${URL}$name"
done
