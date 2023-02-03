package iterator.collections;

import iterator.channels.Channel;
import iterator.channels.ChannelTypeEnum;
import iterator.iterators.ChannelIterator;
import iterator.channels.ChannelLanguageEnum;

public interface ChannelCollection {

	public void addChannel(Channel c);

	public void removeChannel(Channel c);

	public ChannelIterator iteratorByLang(ChannelLanguageEnum lang);

	public ChannelIterator iteratorByType(ChannelTypeEnum type);

}

