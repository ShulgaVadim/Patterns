package iterator.collections;

import iterator.channels.Channel;
import iterator.channels.ChannelLanguageEnum;
import iterator.channels.ChannelTypeEnum;
import iterator.iterators.ChannelIterator;
import iterator.iterators.TVChannelLanguageIterator;
import iterator.iterators.TVChannelTypeIterator;

import java.util.ArrayList;
import java.util.List;

public class TVChannelCollection implements ChannelCollection {

	private List<Channel> channelsList;

	public TVChannelCollection() {
		channelsList = new ArrayList<>();
	}

	public void addChannel(Channel c) {
		this.channelsList.add(c);
	}

	public void removeChannel(Channel c) {
		this.channelsList.remove(c);
	}

	@Override
	public ChannelIterator iteratorByLang(ChannelLanguageEnum lang) {
		return new TVChannelLanguageIterator(lang, this.channelsList);
	}

	@Override
	public ChannelIterator iteratorByType(ChannelTypeEnum type) {
		return new TVChannelTypeIterator(type, this.channelsList);
	}

}