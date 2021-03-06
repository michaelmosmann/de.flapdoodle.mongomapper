package de.flapdoodle.mongomapper.query;

import com.google.common.base.Optional;

import de.flapdoodle.mongomapper.AttributeMapper;

public class CascadedProperty<T, P extends Property<?, ? extends Property<?,?>>> implements Property<T, P> {

    private Optional<P> parent;
    private AttributeMapper<T> mapper;

    public CascadedProperty(P parent, AttributeMapper<T> mapper) {
        this(Optional.of(parent), mapper);
    }
    
    public CascadedProperty(Optional<P> parent, AttributeMapper<T> mapper) {
        this.parent = parent;
        this.mapper = mapper;
    }
    
    public CascadedProperty(AttributeMapper<T> mapper) {
        this.parent = Optional.absent();
        this.mapper = mapper;
    }
    
    @Override
    public String propertyName() {
        return mapper.name();
    }
    
    @Override
    public Optional<P> parentProperty() {
        return parent;
    }
    
    protected AttributeMapper<T> mapper() {
        return mapper;
    };
    
}