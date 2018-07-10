package com.auth0.jwt.b64;

import org.apache.commons.codec.binary.Base64;

public class DefaultBase64Implementation implements Base64Implementation {

    @Override
    public String encodeURLSafeString(byte[] binaryData) {
        return Base64.encodeBase64URLSafeString(binaryData);
    }

    @Override
    public String encode(byte[] binaryData) {
        return Base64.encodeBase64String(binaryData);
    }

    @Override
    public byte[] decode(String base64String) {
        return Base64.decodeBase64(base64String);
    }
}
