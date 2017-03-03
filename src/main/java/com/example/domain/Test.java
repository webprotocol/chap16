package com.example.domain;

import java.io.InputStream;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	private double id;
	private Date mydate;
	private Date mytimestamp;
	private byte[] myblob;
	private InputStream myblob2;

	public InputStream getMyblob2() {
		return myblob2;
	}

	public void setMyblob2(InputStream myblob2) {
		this.myblob2 = myblob2;
	}

	public byte[] getMyblob() {
		return myblob;
	}

	public void setMyblob(byte[] myblob) {
		this.myblob = myblob;
	}

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		ObjectMapper objectMapper = new ObjectMapper();
		
		String json=null;
		try {
			json = objectMapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return json;
	}
	/**
	 * @return the id
	 */
	public double getId() {
		return id;
	}

	/**
	 * @param value the id to set
	 */
	public Test setId(final double value) {
		id = value;
		return this;
	}

	/**
	 * @return the mydate
	 */
	public Date getMydate() {
		return mydate;
	}

	/**
	 * @param value the mydate to set
	 */
	public Test setMydate(final Date value) {
		mydate = value;
		return this;
	}

	/**
	 * @return the mytimestamp
	 */
	public Date getMytimestamp() {
		return mytimestamp;
	}

	/**
	 * @param value the mytimestamp to set
	 */
	public Test setMytimestamp(final Date value) {
		mytimestamp = value;
		return this;
	}

}
