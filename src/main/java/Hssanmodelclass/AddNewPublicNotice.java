package Hssanmodelclass;

public class AddNewPublicNotice {
    public String noticelistview;

    public AddNewPublicNotice(String noticelistview) {
        this.noticelistview = noticelistview;
    }

    public String getNoticelistview() {
        return noticelistview;
    }

    public void setNoticelistview(String noticelistview) {
        this.noticelistview = noticelistview;
    }

    @Override
    public String toString() {
        return "AddNewPublicNotice{" +
                "noticelistview='" + noticelistview + '\'' +
                '}';
    }
}
