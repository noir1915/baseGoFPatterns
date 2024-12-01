package net.noir1915.basepatterns.behavioral.iterator.iterators;

import net.noir1915.basepatterns.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
