package hu.noherczeg.necora.domain.publication;

import hu.noherczeg.necora.domain.language.Language;
import hu.noherczeg.necora.domain.tender.Tender;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Publication implements Serializable {
    private static final long serialVersionUID = -4423275139649799468L;
    private Long id;
    private String title;
    private DateTime date;
    private Integer proofread;
    private String placeOfPublication;
    private String publisher;
    private Integer numberOfPages;
    private String volume;
    private Double impactFactor;
    private Integer independentOnReference;
    private Integer dependentOnReference;
    private String mtmtId;
    private String comment;
    private Set<Tender> tenders;
    private Language language;
    private PublicationType type;
    private Set<Author> authors;

    public Publication() {
        this.tenders = new LinkedHashSet<>();
        this.authors = new LinkedHashSet<>();
    }

    public Publication(String title, DateTime date, Integer proofread, String placeOfPublication, String publisher, Integer numberOfPages, String volume, Double impactFactor) {
        this.tenders = new LinkedHashSet<>();
        this.authors = new LinkedHashSet<>();
        this.title = title;
        this.date = date;
        this.proofread = proofread;
        this.placeOfPublication = placeOfPublication;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.volume = volume;
        this.impactFactor = impactFactor;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public DateTime getDate() {
        return date;
    }

    public Integer isProofread() {
        return proofread;
    }

    public String getPlaceOfPublication() {
        return placeOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public String getVolume() {
        return volume;
    }

    public Double getImpactFactor() {
        return impactFactor;
    }

    public Boolean isIndependentOnReference() {
        return independentOnReference == 1;
    }

    public Boolean isDependentOnReference() {
        return dependentOnReference == 1;
    }

    public String getMtmtId() {
        return mtmtId;
    }

    public String getComment() {
        return comment;
    }

    public Set<Tender> getTenders() {
        return tenders;
    }

    public Language getLanguage() {
        return language;
    }

    public PublicationType getType() {
        return type;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public void setProofread(Boolean proofread) {
        this.proofread = proofread ? 1 : 0;
    }

    public void setPlaceOfPublication(String placeOfPublication) {
        this.placeOfPublication = placeOfPublication;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setImpactFactor(Double impactFactor) {
        this.impactFactor = impactFactor;
    }

    public void setDependentOnReference(Boolean dependentOnReference) {
        this.dependentOnReference = dependentOnReference ? 1 : 0;
    }

    public void setMtmtId(String mtmtId) {
        this.mtmtId = mtmtId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setType(PublicationType type) {
        this.type = type;
    }
}
