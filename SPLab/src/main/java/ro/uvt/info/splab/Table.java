package ro.uvt.info.splab;

public class Table extends TextElement {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Table with Title:" + title);
    }
}