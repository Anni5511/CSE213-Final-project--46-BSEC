package Hssanmodelclass;

public class UpdateTicketStatus {
    public String button,combobox,tableview,title;

    public UpdateTicketStatus(String button, String combobox, String tableview, String title) {
        this.button = button;
        this.combobox = combobox;
        this.tableview = tableview;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTableview() {
        return tableview;
    }

    public void setTableview(String tableview) {
        this.tableview = tableview;
    }

    public String getCombobox() {
        return combobox;
    }

    public void setCombobox(String combobox) {
        this.combobox = combobox;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return "UpdateTicketStatus{" +
                "button='" + button + '\'' +
                ", combobox='" + combobox + '\'' +
                ", tableview='" + tableview + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
