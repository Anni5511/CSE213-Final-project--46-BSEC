package Hssanmodelclass;

public class AddNewPublicNotice {
    public String button,noticelistview;

    public AddNewPublicNotice(String button, String noticelistview) {
        this.button = button;
        this.noticelistview = noticelistview;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
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
                "button='" + button + '\'' +
                ", noticelistview='" + noticelistview + '\'' +
                '}';
    }
}
