package learn.Tsymbaliuk.javacore.privateMethos.sample1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public interface Logger {
    default void writeErrorMessage(String message) throws IOException {
        message += new Date() + message;
        File file = new File("Error.CVS");
        writeToCVSFile(file, message);
    }
    default void writeWarningMessage(String message) throws IOException {
        message += new Date() + message;
        File file = new File("Warning.CVS");
        writeToCVSFile(file, message);
    }
    private void writeToCVSFile(File file, String message) throws IOException {
        try(PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
            pw.print(message + ";");
        } catch (IOException e) {
            throw e;
        }
    }
}
