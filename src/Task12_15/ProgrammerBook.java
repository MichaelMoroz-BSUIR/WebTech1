package Task12_15;

import java.util.Objects;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook() {
        super();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = hash * 31 + Objects.hashCode(language);
        hash = hash * 31 + level;
        return hash ^ (hash >>> 16);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public ProgrammerBook clone() throws CloneNotSupportedException {
        return (ProgrammerBook) super.clone();
    }
}
