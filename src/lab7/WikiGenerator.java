package lab7;

import java.util.ArrayList;
import java.util.List;

public class WikiGenerator {
    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        StringBuilder sb = new StringBuilder();
        DocumentVisitor dokuWikiVisitor = new DokuWikiVisitor();
        for(TextSegment textSegment : textSegments) {
            sb.append(textSegment.accept(dokuWikiVisitor));
        }
        return sb;
    }

    public StringBuilder getMarkdownDocument() {
        StringBuilder sb = new StringBuilder();
        DocumentVisitor markdownVisitor = new MarkdownVisitor();
        for(TextSegment textSegment : textSegments) {
            sb.append(textSegment.accept(markdownVisitor));
        }
        return sb;
    }
}
