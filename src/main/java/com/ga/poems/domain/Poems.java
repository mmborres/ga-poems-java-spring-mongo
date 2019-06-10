package com.ga.poems.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "poems")
public class Poems {

	@Id
	private String id;
	private String mood;
	private String poem;
	private String author;
	private String title;
	
	public Poems(String mood, String title, String author, String poem ) {
		this.mood = mood;
		this.poem = poem;
		this.title = title;
		this.author = author;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public String getPoem() {
		return poem;
	}

	public void setPoem(String poem) {
		this.poem = poem;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
