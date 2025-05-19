package util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Utility class for handling date-related operations in the Library Management System.
 * It provides methods to calculate the number of days a book is returned late
 * and to compute the corresponding fine.
 *
 * OOP Concepts:
 * - Abstraction: This class abstracts date calculations so other classes don't deal with the logic.
 * - Single Responsibility Principle: Focused solely on date utilities.
 */
public class DateUtil {

    /**
     * Calculates the number of days a book is returned past its due date.
     *
     * @param dueDate The due date of the borrowed book.
     * @return Number of days late. Returns 0 if dueDate is null or the book is not late.
     */
    public static long calculateDaysLate(LocalDate dueDate) {
        if (dueDate == null) return 0;
        LocalDate now = LocalDate.now();
        return ChronoUnit.DAYS.between(dueDate, now);
    }

    /**
     * Calculates the fine based on how many days a book is overdue.
     * The fine is $1.50 per day.
     *
     * @param dueDate The due date of the borrowed book.
     * @return Total fine amount. Returns 0.0 if the book is not late.
     */
    public static double calculateFine(LocalDate dueDate) {
        long lateDays = calculateDaysLate(dueDate);
        return lateDays > 0 ? lateDays * 1.50 : 0.0;
    }
}
