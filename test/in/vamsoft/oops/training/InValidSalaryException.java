package in.vamsoft.oops.training;

public class InValidSalaryException extends Exception {

    enum SalaryEnum {

        Min_Level, Max_Level;

    }

    SalaryEnum errorCode;

    public InValidSalaryException() {

    }

    public InValidSalaryException(String message, SalaryEnum errorCode) {
        super(message);
        this.errorCode = errorCode;

    }

    public SalaryEnum getErrorCode() {
        return errorCode;
    }

}
