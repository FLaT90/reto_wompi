package co.com.reto.wompi.utils;

public enum Uri {
    ENDPOINT_TOKEN_AUTENTICATION("/merchants"),
    CREATE_TRANSACTION("/transactions");

    private String uri;

    Uri(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }
}