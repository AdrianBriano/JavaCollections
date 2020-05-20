package com.adr.javacollections.queues;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class PriorityHelpDesk {

    Comparator<Enquiry> BY_CATEGORY = Comparator.comparing(Enquiry::getCategory);
    private Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public void enquire(Customer customer, Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries() {
        while (!enquiries.isEmpty()) {
            Enquiry enquiry = enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

     public static void main(String[] args) {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARY, Category.COMPUTER);

        helpDesk.processAllEnquiries();

    }
}
