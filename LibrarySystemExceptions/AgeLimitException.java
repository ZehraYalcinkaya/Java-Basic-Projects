package LibrarySystemExceptions;

public class AgeLimitException extends Exception {
    public AgeLimitException(String message) {
        super(message);
    }
}

class OutOfTypes extends Exception {
    public OutOfTypes(String message) {
        super(message);
    }
}


class NoBookIdx extends Exception {
    public NoBookIdx(String message) {
        super(message);
    }
}
