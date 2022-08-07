package lab7;

public class ItalicTextSegment extends TextSegment {
    private String content;

    ItalicTextSegment(String content) {
        super(content);
    }

    @Override
    public StringBuilder accept(DocumentVisitor documentVisitor) {
        return documentVisitor.visit(this);
    }
}
