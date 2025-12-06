package Hssanmodelclass;

public class ExportPublicNoticeReport {
    public String title,button,radiobutton,tableview;

    public ExportPublicNoticeReport(String title, String button, String radiobutton, String tableview) {
        this.title = title;
        this.button = button;
        this.radiobutton = radiobutton;
        this.tableview = tableview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getRadiobutton() {
        return radiobutton;
    }

    public void setRadiobutton(String radiobutton) {
        this.radiobutton = radiobutton;
    }

    public String getTableview() {
        return tableview;
    }

    public void setTableview(String tableview) {
        this.tableview = tableview;
    }

    @Override
    public String toString() {
        return "ExportPublicNoticeReport{" +
                "title='" + title + '\'' +
                ", button='" + button + '\'' +
                ", radiobutton='" + radiobutton + '\'' +
                ", tableview='" + tableview + '\'' +
                '}';
    }
}
