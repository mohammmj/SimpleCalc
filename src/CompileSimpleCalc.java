import gen.SimpleCalcLexer;
import gen.SimpleCalcParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

/**
 * Main program for the SimpleCalc compiler
 * Reads a file and the compiles it to pseudocode
 *
 * Usage: java SimpleCalc <input-file>
 *
 * @author Mohammad Jawadi
 */
public class CompileSimpleCalc {

    public static void main(String[] args) throws Exception {

        if (args.length < 1) {
            System.err.println("java CompileSimpleCalc <fil.sc>");
            return;
        }

        String inputFile = args[0];
        System.out.println("Compiling: " + inputFile);

        // reads the input file
        CharStream input = CharStreams.fromFileName(inputFile);
        // create lexer that breaks code to token
        SimpleCalcLexer lexer = new SimpleCalcLexer(input);

        // create token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create parser
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

        String outputFile = inputFile.replace(".x", ".pseudo");
        PrintWriter writer = new PrintWriter(outputFile);

        for (String line : compiler.getPseudoCode()) {
            writer.println(line);
        }

        writer.close();

        System.out.println();
        System.out.println("Pseudocode saved to: " + outputFile);
    }
}
