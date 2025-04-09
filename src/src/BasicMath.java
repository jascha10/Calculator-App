public interface BasicMath<T extends Number> {
    <N extends Number> void add(N value);
    <N extends Number> void subtract(N value);
    <N extends Number> void multiply(N value);
    <N extends Number> void divide(N value);
}
