package org.glytoucan.model.spec;

import java.util.Map;

public interface GlycanClientRegisterSpec {

	public static final String CONTENT_TYPE = "CONTENT_TYPE";
	public static final String MEDIA_TYPE = "MEDIA_TYPE";
	public static final String AUTHORIZATION_HEADER = "Authorization";
	public static final String AUTH_BASIC_HEADER = "Basic ";
	public static final String REGISTRATION = "REGISTRATION";
	public static final String CONTEXT_PATH = "CONTEXT_PATH";
	public static final String SEQUENCE = "SEQUENCE";
	public static final String CONTRIBUTOR_ID = "CONTRIBUTOR_ID";
	public static final String REGISTER_CMD = "/register";
	public static final String LIST_CMD = "/list";
	public static final String REGISTER_WITH_ID_CMD = "/registerWithId";
	public static final String PUBLIC_DATABASE_STRUCTURE_ID = "PUBLIC_DATABASE_STRUCTURE_ID";
  public static final String HOSTNAME = "HOSTNAME";
		
    Map<String, Object> registerStructure(Map<String, Object> map);
}