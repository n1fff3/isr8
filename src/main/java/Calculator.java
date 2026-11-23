public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        // 3*x+9=210
        // x=(210-9)/3
        return div(dif(210, 9), 3);
    }
}
