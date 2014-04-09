package hu.noherczeg.necora.domain.ssa;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class SSAPaperDepartment implements Serializable {
    private static final long serialVersionUID = -2497210556835792177L;
    private Long id;
    private String name;
    private String comment;
    private Set<SSAPaper> ssaPapers;

    public SSAPaperDepartment() {
        this.ssaPapers = new LinkedHashSet<>();
    }

    public SSAPaperDepartment(String name, String comment) {
        this.ssaPapers = new LinkedHashSet<>();
        this.name = name;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public Set<SSAPaper> getSsaPapers() {
        return ssaPapers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
