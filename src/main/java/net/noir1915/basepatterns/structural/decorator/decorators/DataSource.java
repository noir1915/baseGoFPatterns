package net.noir1915.basepatterns.structural.decorator.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}