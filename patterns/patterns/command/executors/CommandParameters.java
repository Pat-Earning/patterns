package patterns.command.executors;

public class CommandParameters {
    private static CommandParameters ourInstance = new CommandParameters();
    private Integer item;

    public static CommandParameters getInstance() {
        return ourInstance;
    }

    private CommandParameters() {
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}
