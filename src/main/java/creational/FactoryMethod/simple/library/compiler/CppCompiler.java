package creational.FactoryMethod.simple.library.compiler;


public class CppCompiler extends Compiler {

    @Override
    public String compile(String code) {
        return "Compiler: CppCompiler, Compilation: Successful.";
    }
}
