package com.codencode.simple.client;

import com.codencode.simple.library.CompilerFactory;
import com.codencode.simple.library.compiler.Compiler;
import com.codencode.simple.library.compiler.CompilerType;

public class Main {
    public static void main(String[] args) {
        Compiler compiler = CompilerFactory.getCompiler(CompilerType.JAVA);

        System.out.println(compiler.compile("c"));
    }
}