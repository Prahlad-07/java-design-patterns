package creational.FactoryMethod.simple.library.compiler;

public class JavaCompiler extends Compiler {
    @Override
    public String compile(String code) {
        return "Compiler: JavaCompiler, Compilation: Successful.";
    }
}
