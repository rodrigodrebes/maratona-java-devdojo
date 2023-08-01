package org.maratonajava.CrudJDBC.dominio;

import java.util.Objects;

public class Producer {
    private final Integer id;
    private final String name;

    private Producer(ProducerBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static ProducerBuilder builder() {
        return new ProducerBuilder();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return String.format("Producer [id = %d, name = %s]", id, name);
    }

    public static class ProducerBuilder {
        private Integer id;
        private String name;

        public ProducerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            return new Producer(this);
        }
    }
}
