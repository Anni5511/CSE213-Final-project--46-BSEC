package Hssanmodelclass;

public class PublishAnnouncement {

    public String title,textarea,tableview,datepicker;

    public PublishAnnouncement(String title, String textarea, String tableview, String datepicker) {
        this.title = title;
        this.textarea = textarea;
        this.tableview = tableview;
        this.datepicker = datepicker;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }

    public String getTableview() {
        return tableview;
    }

    public void setTableview(String tableview) {
        this.tableview = tableview;
    }

    public String getDatepicker() {
        return datepicker;
    }

    public void setDatepicker(String datepicker) {
        this.datepicker = datepicker;
    }

    @Override
    public String toString() {
        return "PublishAnnouncement{" +
                "title='" + title + '\'' +
                ", textarea='" + textarea + '\'' +
                ", tableview='" + tableview + '\'' +
                ", datepicker='" + datepicker + '\'' +
                '}';
    }
}
