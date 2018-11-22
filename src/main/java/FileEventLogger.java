import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {

    private String fileName;
    private File file;

    public FileEventLogger() {
    }

    public FileEventLogger(String filename) {
        this.fileName = filename;
    }

    public void init() throws IOException{
        this.file = new File(fileName);
        if (!file.exists()){
            file.createNewFile();
        }
        if (!file.canWrite()){
            throw new IOException("can`t write into file");
        }
    }

    public void logEvent(Event event) {
        writeMessageToFile(event.getMsg());
    }

    protected void writeMessageToFile(String message){
        try {
            FileUtils.writeStringToFile(file, message+"\r\n", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
