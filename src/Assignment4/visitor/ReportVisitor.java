package Assignment4.visitor;

public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Создание отчета для текстового файла: " + textFile.getContent());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Создание отчета для исполняемого файла с кодом.");
    }
}
