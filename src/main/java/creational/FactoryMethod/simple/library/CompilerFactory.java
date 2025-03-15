package creational.FactoryMethod.simple.library;


import creational.FactoryMethod.simple.library.compiler.*;
import creational.FactoryMethod.simple.library.compiler.Compiler;

public class CompilerFactory {
    public static Compiler getCompiler(CompilerType type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case CPP:
                return new CppCompiler();
            case JAVA:
                return new JavaCompiler();
            case PYTHON:
                return new PythonCompiler();
            default:
                throw new IllegalArgumentException("Unknown Compiler Type.");
        }
    }
}
