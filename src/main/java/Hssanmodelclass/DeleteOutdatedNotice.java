package Hssanmodelclass;

public class DeleteOutdatedNotice {
    public String button,tableview,label;

    public DeleteOutdatedNotice(String button, String tableview, String label) {
        this.button = button;
        this.tableview = tableview;
        this.label = label;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getTableview() {
        return tableview;
    }

    public void setTableview(String tableview) {
        this.tableview = tableview;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "DeleteOutdatedNotice{" +
                "button='" + button + '\'' +
                ", tableview='" + tableview + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
