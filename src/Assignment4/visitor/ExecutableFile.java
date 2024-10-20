package Assignment4.visitor;

public class ExecutableFile implements File {
    private String code;

    public ExecutableFile(String code) {
        this.code = code;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getCode() {
        return code;
    }
}
