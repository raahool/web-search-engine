package com.moran.search.engine.models.search;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class CompositKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "urlId", referencedColumnName = "urlId") })
	private SiteRepo siteRepo;
	private String word;

	public CompositKey() {
	}

	public SiteRepo getSiteRepo() {
		return siteRepo;
	}

	public void setSiteRepo(SiteRepo siteRepo) {
		this.siteRepo = siteRepo;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "CompositKey [siteRepo=" + siteRepo + ", word=" + word + "]";
	}
}