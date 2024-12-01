package net.noir1915.basepatterns.behavioral.iterator.social_networks;

import net.noir1915.basepatterns.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
