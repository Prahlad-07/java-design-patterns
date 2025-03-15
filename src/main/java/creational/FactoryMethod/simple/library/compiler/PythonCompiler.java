package creational.FactoryMethod.simple.library.compiler;


public class PythonCompiler extends Compiler {
    @Override
    public String compile(String code) {
        return "Compiler: PythonCompiler, Compilation: Successful.";
    }
}
