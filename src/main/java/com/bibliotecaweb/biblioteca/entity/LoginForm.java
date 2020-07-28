package com.bibliotecaweb.biblioteca.entity;

import java.util.Objects;

public class LoginForm {
        private String username;
        private String pass;

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPass() {
                return pass;
        }

        public void setPass(String pass) {
                this.pass = pass;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof LoginForm)) return false;
                LoginForm loginForm = (LoginForm) o;
                return Objects.equals(getUsername(), loginForm.getUsername()) &&
                        Objects.equals(getPass(), loginForm.getPass());
        }

        @Override
        public int hashCode() {
                return Objects.hash(getUsername(), getPass());
        }
}
