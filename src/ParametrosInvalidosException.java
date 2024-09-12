public class ParametrosInvalidosException extends Exception{

    private String msg;

    public ParametrosInvalidosException(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
