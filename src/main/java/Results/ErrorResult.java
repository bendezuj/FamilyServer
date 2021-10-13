package Results;

/** Father class for all error responses*/

public class ErrorResult {
    private String message;
    private Boolean success;
    public ErrorResult(){
    }

    public ErrorResult(String errorMessage, Boolean success) {
        this.message = errorMessage;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
