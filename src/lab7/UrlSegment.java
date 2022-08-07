package lab7;

public class UrlSegment extends TextSegment {
    private String content;
    private String s;

    UrlSegment(String content, String s) {
        super(content);
        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public StringBuilder accept(DocumentVisitor documentVisitor) {
        return documentVisitor.visit(this);
    }
}
