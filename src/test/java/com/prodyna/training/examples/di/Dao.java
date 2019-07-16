package com.prodyna.training.injection.assisted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {

        private String name;

        public Dao(@Autowired String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dao{" +
                    "name='" + name + '\'' +
                    '}';
        }
}
