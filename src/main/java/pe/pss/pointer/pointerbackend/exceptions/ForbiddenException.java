package pe.pss.pointer.pointerbackend.exceptions;

public class ForbiddenException extends RuntimeException {
    //private static final String DESCRIPTION = "Forbidden Exception (403)";

    public ForbiddenException(String detail) {
        super(detail);
    }

}
