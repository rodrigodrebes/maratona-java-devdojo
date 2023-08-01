package org.maratonajava.CrudJDBC.dominio;

public class Anime {
    private final Integer id;
    private final String name;
    private final int epsisodes;
    private final Producer producer;

    private Anime(AnimeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.epsisodes = builder.epsisodes;
        this.producer = builder.producer;
    }

    public static AnimeBuilder builder() {
        return new AnimeBuilder();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEpsisodes() {
        return epsisodes;
    }

    public Producer getProducer() {
        return producer;
    }

    public static class AnimeBuilder {
        private Integer id;
        private String name;
        private int epsisodes;
        private Producer producer;

        public AnimeBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public AnimeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimeBuilder epsisodes(int epsisodes) {
            this.epsisodes = epsisodes;
            return this;
        }

        public AnimeBuilder producer(Producer producer) {
            this.producer = producer;
            return this;
        }

        public Anime build() {
            return new Anime(this);
        }
    }
}
