package com.film.producer.core.model.data;




/**
 * Created by Silvina on 15/11/2016.
 */
public class ActorData {
    private long id;
    private String firstName;
    private String lastName;

    private ActorData (final Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName= builder.lastName;
    }
    public static final class Builder {
        private long id;
        private String firstName;
        private String lastName;


        public ActorData build() {
            return new ActorData(this);
        }

        public Builder withId(final long id) {
            this.id = id;
            return this;
        }

        public Builder withFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }
    }
}
