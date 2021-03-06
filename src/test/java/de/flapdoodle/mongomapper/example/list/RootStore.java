package de.flapdoodle.mongomapper.example.list;

import com.mongodb.DBCollection;

import de.flapdoodle.mongomapper.AbstractStringIdStore;

public class RootStore extends AbstractStringIdStore<Root, Root> {

    public RootStore(DBCollection collection) {
        super(collection, RootMapper.INSTANCE);
    }

}
