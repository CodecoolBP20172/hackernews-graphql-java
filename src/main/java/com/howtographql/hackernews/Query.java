package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;
    private final UserRepository userRepository;

    public Query(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }

    public List<User> allUsers() {
        return userRepository.getAllUsers();
    }
}
