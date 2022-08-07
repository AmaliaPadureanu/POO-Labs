package lab7;

public interface DocumentVisitor {
    public StringBuilder visit(ItalicTextSegment italicTextSegment);
    public StringBuilder visit(BoldTextSegment boldTextSegment);
    public StringBuilder visit(PlainTextSegment plainTextSegment);
    public StringBuilder visit(UrlSegment urlSegment);
}
