public class FileEvemtLogger implements EventLogger {

    private String filename;

    public FileEvemtLogger(String filename) {
        this.filename = filename;
    }

    public void logEvent(Event event) {

    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
