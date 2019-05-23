package entity;

public class Result {

    private int code;
    private boolean flag;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(int code, boolean flag, String message, Object data) {
        this.code = code;
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    public Result(int code, boolean flag, String message) {
        this.code = code;
        this.flag = flag;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isFlag() {
        return this.flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Result)) return false;
        final Result other = (Result) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getCode() != other.getCode()) return false;
        if (this.isFlag() != other.isFlag()) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$data = this.getData();
        final Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Result;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getCode();
        result = result * PRIME + (this.isFlag() ? 79 : 97);
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "Result(code=" + this.getCode() + ", flag=" + this.isFlag() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }
}
