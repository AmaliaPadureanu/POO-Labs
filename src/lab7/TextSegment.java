package lab7;

/**
 * Represents a text segment of a document that needs to be parsed.
 */
public abstract class TextSegment {
    private String content;

    TextSegment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public abstract StringBuilder accept(DocumentVisitor documentVisitor);
}
