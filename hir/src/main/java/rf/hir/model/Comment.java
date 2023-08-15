package rf.hir.model;

public class Comment {
    private int commentID;
    private int commenterID;
    private int hirID;
    private String comment;

    public Comment(){}

    public Comment(int cid, int hid) {
        commenterID=cid;
        hirID=hid;
        comment="";
    }

    public Comment(int cid, int hid, String str) {
        commenterID=cid;
        hirID=hid;
        comment=str;
    }

    public int getHirID() {
        return hirID;
    }

    public void setHirID(int hirID) {
        this.hirID = hirID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getCommenterID() {
        return commenterID;
    }

    public void setCommenterID(int commenterID) {
        this.commenterID = commenterID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
