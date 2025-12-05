package Hssanmodelclass;

public class ViewAllNotices {
    public String noticetableview,button;

    public ViewAllNotices(String noticetableview, String button) {
        this.noticetableview = noticetableview;
        this.button = button;
    }

    public ViewAllNotices(String noticetableview) {
        this.noticetableview = noticetableview;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getNoticetableview() {
        return noticetableview;
    }

    public void setNoticetableview(String noticetableview) {
        this.noticetableview = noticetableview;
    }

    @Override
    public String toString() {
        return "ViewAllNotices{" +
                "noticetableview='" + noticetableview + '\'' +
                ", button='" + button + '\'' +
                '}';
    }

}
