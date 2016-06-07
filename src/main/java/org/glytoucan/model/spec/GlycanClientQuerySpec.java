package org.glytoucan.model.spec;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

public interface GlycanClientQuerySpec {

	public static final String USERNAME = "USERNAME";
	public static final String MESSAGE = "MESSAGE";
	public static final String CONTENT_TYPE = "CONTENT_TYPE";
	public static final String MEDIA_TYPE = "MEDIA_TYPE";
	public static final String AUTHORIZATION_HEADER = "Authorization";
	public static final String AUTH_BASIC_HEADER = "Basic ";
	public static final String HOSTNAME = "HOSTNAME";
	public static final String REGISTRATION = "REGISTRATION";
	public static final String CONTEXT_PATH = "CONTEXT_PATH";
	public static final String SEQUENCE = "SEQUENCE";
	public static final String LIST_CMD = "/list";
	public static final String PAYLOAD = "payload";
	public static final String LIMIT = "limit";
	public static final String OFFSET = "offset";
		
    public Map<String, Object> getListStructures(Map<String, Object> gmap);

    String getImage(String hostname, String sequence)
        throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException;

    String getImage(String hostname, String sequence, Map<String, Object> data)
        throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException;

    String getRegisteredImage(String hostname, String accessionNumber, String imageFormat, String notation,
        String style) throws IOException;
}