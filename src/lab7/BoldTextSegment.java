package lab7;

public class BoldTextSegment extends TextSegment{
    private String content;

    BoldTextSegment(String content) {
        super(content);
    }

    @Override
    public StringBuilder accept(DocumentVisitor documentVisitor) {
        return documentVisitor.visit(this);
    }
}
