package com.moran.search.engine.models.search;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SiteRepo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer urlId;
	private String siteUrl;

	public Integer getUrlId() {
		return urlId;
	}

	public void setUrlId(Integer urlId) {
		this.urlId = urlId;
	}

	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	@Override
	public String toString() {
		return "SiteRepo [siteUrl=" + siteUrl + "]";
	}
}