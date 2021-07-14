package com.austin;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import java.util.List;

import javax.inject.Inject;

@QuarkusMain
public class Runner implements QuarkusApplication{

    @Inject
    @RestClient
    RoomServiceRest roomService;

    @Override
    public int run(String... args) throws Exception {
        List<Room> rooms = roomService.getAllRooms();
        rooms.forEach(System.out::println);
        return 0;
    }
}