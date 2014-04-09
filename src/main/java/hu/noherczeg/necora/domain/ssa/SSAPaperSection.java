package hu.noherczeg.necora.domain.ssa;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class SSAPaperSection implements Serializable {
    private static final long serialVersionUID = 4422801718668562655L;
    private long id;
    private String name;
    private String comment;
    private Set<SSAPaper> ncssaPapers;
    private Set<SSAPaper> facultySSAPapers;

    public SSAPaperSection() {
        this.ncssaPapers = new LinkedHashSet<>();
        this.facultySSAPapers = new LinkedHashSet<>();
    }

    public SSAPaperSection(String name, String comment) {
        this.ncssaPapers = new LinkedHashSet<>();
        this.facultySSAPapers = new LinkedHashSet<>();
        this.name = name;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public Set<SSAPaper> getNcssaPapers() {
        return ncssaPapers;
    }

    public Set<SSAPaper> getFacultySSAPapers() {
        return facultySSAPapers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
