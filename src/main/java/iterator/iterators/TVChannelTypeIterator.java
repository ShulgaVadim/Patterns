package iterator.iterators;

import iterator.channels.Channel;
import iterator.channels.ChannelTypeEnum;

import java.util.List;

public class TVChannelTypeIterator implements ChannelIterator{

	private ChannelTypeEnum type;
	private List<Channel> channels;
	private int position;

	public TVChannelTypeIterator(ChannelTypeEnum type,
	                             List<Channel> channelsList) {
		this.type = type;
		this.channels = channelsList;
	}


	@Override
	public boolean hasNext() {
		while (position < channels.size()) {
			Channel c = channels.get(position);
			if (c.getType().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
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
