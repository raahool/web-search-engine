package com.moran.search.engine.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		//this is a Cruel world Hello world How are you, how many old years are you!

		try (Stream<String> sentence = Files.lines(Paths.get("/Users/rahmohan/Downloads/temp/lines.txt"),
				StandardCharsets.UTF_8)) {

			Map<String, Long> sc = sentence.flatMap(s -> Stream.of(s.split(" +")))
					.map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim()).filter(word -> !word.isEmpty())
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			System.out.println(sc);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
