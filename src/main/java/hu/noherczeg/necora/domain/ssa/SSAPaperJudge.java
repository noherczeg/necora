package hu.noherczeg.necora.domain.ssa;

import hu.noherczeg.necora.domain.user.User;

import java.io.Serializable;

public class SSAPaperJudge implements Serializable {
    private static final long serialVersionUID = -2093920716179420098L;
    private Long id;
    private String comment;
    private User judge;
    private SSAPaper ssaPaper;

    public SSAPaperJudge() {
    }

    public SSAPaperJudge(SSAPaper ssaPaper, User judge, String comment) {
        this.ssaPaper = ssaPaper;
        this.judge = judge;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public User getJudge() {
        return judge;
    }

    public SSAPaper getSsaPaper() {
        return ssaPaper;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setJudge(User judge) {
        this.judge = judge;
    }

    public void setSsaPaper(SSAPaper ssaPaper) {
        this.ssaPaper = ssaPaper;
    }
}
