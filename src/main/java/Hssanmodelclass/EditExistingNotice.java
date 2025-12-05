package Hssanmodelclass;

public class EditExistingNotice {
    public String title,textfeild,button;

    public EditExistingNotice(String title, String textfeild, String button) {
        this.title = title;
        this.textfeild = textfeild;
        this.button = button;
    }

    public EditExistingNotice(String title, String textfeild) {
        this.title = title;
        this.textfeild = textfeild;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextfeild() {
        return textfeild;
    }

    public void setTextfeild(String textfeild) {
        this.textfeild = textfeild;
    }

    @Override
    public String toString() {
        return "EditExistingNotice{" +
                "title='" + title + '\'' +
                ", textfeild='" + textfeild + '\'' +
                ", button='" + button + '\'' +
                '}';
    }
}
