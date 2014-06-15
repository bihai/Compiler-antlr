BASE="/Users/whimsycwd/Repo/ANTLR/Tiger/"

export CLASSPATH=".:./lib/antlr-4.2.1-complete.jar:${BASE}lib/antlr-4.2.1-complete.jar:${BASE}classes"

alias antlr4='java  org.antlr.v4.Tool'
alias grun='java org.antlr.v4.runtime.misc.TestRig'
alias runTiger='grun Tiger program'
