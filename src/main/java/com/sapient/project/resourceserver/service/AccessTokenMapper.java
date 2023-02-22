package com.sapient.project.resourceserver.service;

import java.util.ArrayList;
import java.util.List;

public class AccessTokenMapper {

	private String id;
	private List<String> authorities = new ArrayList<>();
	private String first_name;
	private String last_name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}