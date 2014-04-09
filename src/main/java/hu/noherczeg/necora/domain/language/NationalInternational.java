package hu.noherczeg.necora.domain.language;

import java.io.Serializable;

public class NationalInternational implements Serializable {
    private static final long serialVersionUID = 3073496694773523454L;
    private int id;
    private String name;

    public NationalInternational() {
    }

    public NationalInternational(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
