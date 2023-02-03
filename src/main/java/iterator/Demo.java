package iterator;

import iterator.channels.Channel;
import iterator.channels.ChannelLanguageEnum;
import iterator.channels.ChannelTypeEnum;
import iterator.collections.ChannelCollection;
import iterator.collections.TVChannelCollection;
import iterator.iterators.ChannelIterator;

import java.util.Scanner;

public class Demo {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ChannelCollection channels = populateChannels();
		iterateByLanguage(channels);
		iterateByType(channels);
	}

	private static void iterateByLanguage(ChannelCollection channels) {
		System.out.println("Please specify channel language (default:All):");
		System.out.println("1. English");
		System.out.println("2. German");
		System.out.println("3. French");
		String choice = scanner.nextLine();
		ChannelIterator iterator = null;
		switch (choice) {
			case ("1"):
				iterator = channels.iteratorByLang(ChannelLanguageEnum.ENGLISH);
				break;
			case ("2"):
				iterator = channels.iteratorByLang(ChannelLanguageEnum.GERMAN);
				break;
			case ("3"):
				iterator = channels.iteratorByLang(ChannelLanguageEnum.FRENCH);
				break;
			default:
				iterator = channels.iteratorByLang(ChannelLanguageEnum.ALL);
		}
		while (iterator.hasNext()) {
			Channel c = iterator.next();
			System.out.println(c.toString());
		}
		System.out.println("*******************");
		System.out.println();
	}

	private static void iterateByType(ChannelCollection channels) {
		System.out.println("Please specify channel type (default:All):");
		System.out.println("1. News");
		System.out.println("2. Sports");
		System.out.println("3. Musics");
		ChannelIterator iterator = null;
		String choice = scanner.nextLine();
		switch (choice) {
			case ("1"):
				iterator = channels.iteratorByType(ChannelTypeEnum.NEWS);
				break;
			case ("2"):
				iterator = channels.iteratorByType(ChannelTypeEnum.SPORTS);
				break;
			case ("3"):
				iterator = channels.iteratorByType(ChannelTypeEnum.MUSIC);
				break;
			default:
				iterator = channels.iteratorByType(ChannelTypeEnum.ALL);
		}
		while (iterator.hasNext()) {
			Channel c = iterator.next();
			System.out.println(c.toString());
		}
	}

	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new TVChannelCollection();
		channels.addChannel(new Channel("MTV", ChannelLanguageEnum.ENGLISH, ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("BBC", ChannelLanguageEnum.ENGLISH, ChannelTypeEnum.NEWS));
		channels.addChannel(new Channel("L'Équipe", ChannelLanguageEnum.FRENCH, ChannelTypeEnum.NEWS));
		channels.addChannel(new Channel("CNN", ChannelLanguageEnum.ENGLISH, ChannelTypeEnum.NEWS));
		channels.addChannel(new Channel("Deutsche Welle TV", ChannelLanguageEnum.GERMAN, ChannelTypeEnum.NEWS));
		channels.addChannel(new Channel("Canal+ Sport", ChannelLanguageEnum.FRENCH, ChannelTypeEnum.SPORTS));
		channels.addChannel(new Channel("VIVA", ChannelLanguageEnum.GERMAN, ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("Eurosport", ChannelLanguageEnum.GERMAN, ChannelTypeEnum.SPORTS));
		channels.addChannel(new Channel("Sky Sport", ChannelLanguageEnum.ENGLISH, ChannelTypeEnum.SPORTS));
		channels.addChannel(new Channel("Bloomberg", ChannelLanguageEnum.ENGLISH, ChannelTypeEnum.NEWS));
		channels.addChannel(new Channel("VH1", ChannelLanguageEnum.ENGLISH, ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("Sky Bundesliga", ChannelLanguageEnum.GERMAN, ChannelTypeEnum.SPORTS));
		channels.addChannel(new Channel("Das Erste", ChannelLanguageEnum.GERMAN, ChannelTypeEnum.NEWS));
		channels.addChannel(new Channel("MusicBox", ChannelLanguageEnum.GERMAN, ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("MCM", ChannelLanguageEnum.FRENCH, ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("TF1", ChannelLanguageEnum.FRENCH, ChannelTypeEnum.NEWS));
		channels.addChannel(new Channel("BeIN Sports", ChannelLanguageEnum.FRENCH, ChannelTypeEnum.SPORTS));
		return channels;
	}
}