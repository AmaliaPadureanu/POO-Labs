package lab7;

public class PlainTextSegment extends TextSegment {
    private String content;

    PlainTextSegment(String content) {
        super(content);
    }

    @Override
    public StringBuilder accept(DocumentVisitor documentVisitor) {
       return documentVisitor.visit(this);
    }
}
