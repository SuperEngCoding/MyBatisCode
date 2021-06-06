public class Result<T> {

    private static final long serialVersionUID = -3948389268046368059L;

    private Integer code;

    private String msg;

    private T data;

    public Result(T data) {

    }

    public Result() {
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }







    public static <K> Result<K> success(K data) {
        Result<K> result = new Result<>(data);
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
