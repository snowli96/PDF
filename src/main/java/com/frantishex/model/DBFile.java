package com.frantishex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.transaction.Transactional;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Transactional
public class DBFile {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;

	@Column(name = "name", columnDefinition = "VARCHAR(128)")
	private String name;

	private String fileType;

	@Lob
	private byte[] data;

	public DBFile() {

	}

	public DBFile(String name, String fileType, byte[] data) {
		this.name = name;
		this.fileType = fileType;
		this.data = data;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DBFile(String fileName, byte[] data) {
		this.name = fileName;
		this.data = data;
	}

}