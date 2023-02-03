package iterator.iterators;

import iterator.channels.Channel;
import iterator.channels.ChannelLanguageEnum;

import java.util.List;

public class TVChannelLanguageIterator implements ChannelIterator {
	private ChannelLanguageEnum lang;
	private List<Channel> channels;
	private int position;

	public TVChannelLanguageIterator(ChannelLanguageEnum lang,
	                                 List<Channel> channelsList) {
		this.lang = lang;
		this.channels = channelsList;
	}


	@Override
	public boolean hasNext() {
		while (position < channels.size()) {
			Channel c = channels.get(position);
			if (c.getLang().equals(lang) || lang.equals(ChannelLanguageEnum.ALL)) {
				return true;
			} else
				position++;
		}
		return false;
	}

	@Override
	public Channel next() {
		Channel c = channels.get(position);
		position++;
		return c;
	}
}