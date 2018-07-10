package com.auth0.jwt.b64;

public interface Base64Implementation {
    String encodeURLSafeString(final byte[] binaryData);
    String encode(final byte[] binaryData);
    byte[] decode(final String base64String);
}
