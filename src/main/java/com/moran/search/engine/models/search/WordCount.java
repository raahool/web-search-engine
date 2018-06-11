package com.moran.search.engine.models.search;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class WordCount {

	@EmbeddedId
	private CompositKey compositKey;
	private int wordCount;

	public CompositKey getCompositKey() {
		return compositKey;
	}

	public void setCompositKey(CompositKey compositKey) {
		this.compositKey = compositKey;
	}

	public int getWordCount() {
		return wordCount;
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}

	@Override
	public String toString() {
		return "WordCount [compositKey=" + compositKey + ", wordCount=" + wordCount + "]";
	}
}
