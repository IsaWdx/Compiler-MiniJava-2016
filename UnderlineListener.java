import org.antlr.v4.runtime.*;
import java.util.*;

public class UnderlineListener extends BaseErrorListener {
	public void syntaxError(Recognizer<?, ?> recognizer,
				Object offendingSymbol,
				int line, int charPositionInLine,
				String msg,
				RecognitionException e)
    {
        System.err.println("line "+line+":"+charPositionInLine+" "+msg);
        underlineError(recognizer,(Token)offendingSymbol,
                       line, charPositionInLine);
    }

    protected void underlineError(Recognizer recognizer,
                                  Token offendingToken, int line,
                                  int charPositionInLine)
    {
        MiniJava.publicErrorLine(line, charPositionInLine, charPositionInLine+offendingToken.getText().length());
    }
}

