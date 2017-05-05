package tesinaplugin.exception;

public class genericException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public genericException() {
		super();
	}

	public genericException(String msg) {
		super(msg);
	}

	public genericException(Throwable e) {
		super(e);
	}

	public genericException(String msg, Throwable e) {
		super(msg, e);
	}

}
