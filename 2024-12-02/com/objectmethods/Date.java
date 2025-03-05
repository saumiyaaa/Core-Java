package com.objectmethods;

public class Date {

    private int day, month, year;

    // Default constructor initializing fields to default values
    public Date() { 
        day = 10; 
        month = 10; 
        year = 2010;
    }

    // Parameterized constructor with 3 arguments
    public Date(int day, int month, int year) {
        this(day); // Calls the single-parameter constructor
        this.month = month;
        this.year = year;
    }

    // Parameterized constructor with 1 argument
    public Date(int day) {
        this.day = day;
    }

    /**
     * The equals method checks if two Date objects are logically equivalent.
     * @param obj The object to compare with the current instance.
     * @return true if the given object is also a Date with the same day, month, and year; false otherwise.
     * 
     * Steps:
     * 1. Cast the passed `Object` to a `Date` object.
     * 2. Compare the `day`, `month`, and `year` fields of both objects.
     * 3. Return `true` if all fields match, otherwise return `false`.
     * 
     * Note:
     * - This implementation assumes the passed object is always a `Date`.
     * - Ideally, it should include null checks and class type checks for safety.
     */
    @Override
    public boolean equals(Object obj) {
      /*  if (this == obj) return true; // If both references are the same, they are equal.
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null or incompatible types. */

        Date d = (Date) obj; // Safe to cast because of the above check.
        return this.day == d.day && this.month == d.month && this.year == d.year;
    }

    /**
     * The toString method returns a string representation of the Date object.
     * @return A string in the format "day/month/year".
     */
    @Override
    public String toString() {
        return (day + "/" + month + "/" + year);
    }

}
