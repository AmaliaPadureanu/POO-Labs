package lab7;

public class MarkdownVisitor implements DocumentVisitor {

    private StringBuilder sb;

    public StringBuilder getSb() {
        return sb;
    }

    @Override
    public StringBuilder visit(ItalicTextSegment italicTextSegment) {
        sb = new StringBuilder(italicTextSegment.getContent());
        sb.insert(0, "_");
        sb.append("_");
        return sb;
    }

    @Override
    public StringBuilder visit(BoldTextSegment boldTextSegment) {
        sb = new StringBuilder(boldTextSegment.getContent());
        sb.insert(0, "**");
        sb.append("**");
        return sb;
    }

    @Override
    public StringBuilder visit(PlainTextSegment plainTextSegment) {
        sb = new StringBuilder(plainTextSegment.getContent());
        return sb;
    }

    @Override
    public StringBuilder visit(UrlSegment urlSegment) {
        sb = new StringBuilder(urlSegment.getContent());
        sb.insert(0, "[" + urlSegment.getS() + "]" + "(");
        sb.append(")");
        return sb;
    }
}
