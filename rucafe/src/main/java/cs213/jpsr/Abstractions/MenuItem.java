package cs213.jpsr.Abstractions;

public interface MenuItem extends Comparable<Object> {
    double itemPrice();

    int itemOrderNumber();
}
