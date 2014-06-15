# RUN ALL TEST
# May 31, 2014 whimsycwd 


echo "deleting testcases-result"
rm testcases-result/*

for i in {1..49}
do 
    echo "test${i}.tig is processing"
    java org.antlr.v4.runtime.misc.TestRig Tiger program -tree "testcases/test${i}.tig" > "testcases-result/test${i}.tig.res"
done

for name in 'queens.tig' 'merge.tig'
do
    echo "${name} is processing"
    java org.antlr.v4.runtime.misc.TestRig Tiger program -tree "testcases/${name}" > "testcases-result/${name}.res"
done


