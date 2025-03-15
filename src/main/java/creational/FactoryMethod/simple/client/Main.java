package creational.FactoryMethod.simple.client;

import creational.FactoryMethod.simple.library.CompilerFactory;
import creational.FactoryMethod.simple.library.compiler.Compiler;
import creational.FactoryMethod.simple.library.compiler.CompilerType;

public class Main {
    public static void main(String[] args) {
        Compiler compiler = CompilerFactory.getCompiler(CompilerType.JAVA);

        System.out.println(compiler.compile("c"));
    }
}