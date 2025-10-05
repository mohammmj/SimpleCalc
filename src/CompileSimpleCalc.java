import gen.SimpleCalcLexer;
import gen.SimpleCalcParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;


public class CompileSimpleCalc {

    public static void main(String[] args) throws Exception {

        if (args.length < 1) {
            System.err.println("java CompileSimpleCalc <fil.sc>");
            return;
        }

        String inputFile = args[0];
        System.err.println("Compiling: " + inputFile);

        CharStream input = CharStreams.fromFileName(inputFile);

        SimpleCalcLexer lexer = new SimpleCalcLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleCalcParser parser = new SimpleCalcParser(tokens);

        ParseTree tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax error found");
            return;
        }


        SimpleCalcCompiler compiler = new SimpleCalcCompiler();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(compiler, tree);


        System.out.println("// Pseudocode for: " + inputFile);
        System.out.println();

        for (String line : compiler.getPseudoCode()) {
            System.out.println(line);
        }

        String outputFile = inputFile.replace(".sc", ".pseudo");
        PrintWriter writer = new PrintWriter(outputFile);

        for (String line : compiler.getPseudoCode()) {
            writer.println(line);
        }

        writer.close();

        System.err.println();
        System.err.println("Pseudocode saved to: " + outputFile);
        System.err.println("Now start: java -jar lib/nand2tetris-vm-translator.jar " + outputFile);
    }
}
