package com.moran.search.engine.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moran.search.engine.models.search.CompositKey;
import com.moran.search.engine.models.search.SiteRepo;
import com.moran.search.engine.models.search.WordCount;
import com.moran.search.engine.repository.SiteRepository;
import com.moran.search.engine.repository.SiteWordCountRepository;

@Service
public class SiteParser {
	private static final Logger logger = LoggerFactory.getLogger(SiteParser.class);

	@Autowired
	private SiteWordCountRepository countRepository;
	@Autowired
	private SiteRepository siteRepository;

	public WordCount saveWordCount(SiteRepo siteRepo, String word, int count) {
		WordCount wordCount = new WordCount();
		CompositKey compositKey = new CompositKey();
		compositKey.setSiteRepo(siteRepo);
		compositKey.setWord(word);

		wordCount.setCompositKey(compositKey);
		wordCount.setWordCount(count);

		countRepository.save(wordCount);
		logger.info("Created : " + wordCount.toString());
		return wordCount;
	}

	public SiteRepo saveSiteRepo(String siteUrl) {
		SiteRepo siteRepo = new SiteRepo();
		siteRepo.setSiteUrl(siteUrl);
		return siteRepository.save(siteRepo);
	}
}
