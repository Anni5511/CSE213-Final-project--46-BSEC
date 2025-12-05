package Hssanmodelclass;

public class ViewFAQs {
    public String title,textfield,tableview,button;

    public ViewFAQs(String title, String textfield, String tableview, String button) {
        this.title = title;
        this.textfield = textfield;
        this.tableview = tableview;
        this.button = button;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextfield() {
        return textfield;
    }

    public void setTextfield(String textfield) {
        this.textfield = textfield;
    }

    public String getTableview() {
        return tableview;
    }

    public void setTableview(String tableview) {
        this.tableview = tableview;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return "ViewFAQs{" +
                "title='" + title + '\'' +
                ", textfield='" + textfield + '\'' +
                ", tableview='" + tableview + '\'' +
                ", button='" + button + '\'' +
                '}';
    }
}
