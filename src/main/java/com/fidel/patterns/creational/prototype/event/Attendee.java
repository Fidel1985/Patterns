package com.fidel.patterns.creational.prototype.event;

import com.google.common.base.MoreObjects;

class Attendee {
    private String firstName;
    private String lastName;
    private String email;

    Attendee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("email", email)
                .toString();
    }
}
