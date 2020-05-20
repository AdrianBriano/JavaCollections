package com.adr.javacollections.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class HelpDesk {

    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(Customer customer, Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries() {
        while (!enquiries.isEmpty()) {
            Enquiry enquiry = enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public void processPrinterEnquiries() {

        String message = "Is it out of paper?";
        processEnquiry(enq -> enq.getCategory() == Category.PRINTER, message);
    }

    public void processGeneralEnquiries() {

        String message = "Have you tried turning it off and on again?";
        processEnquiry(enq -> enq.getCategory() != Category.PRINTER, message);
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message) {
        {
            Enquiry enquiry = enquiries.peek();

            if (enquiry != null && predicate.test(enquiry)) {

                enquiries.remove();

                enquiry.getCustomer().reply(message);

            } else {
                System.out.println("No action from Printers team");
            }

        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

//        helpDesk.processAllEnquiries();
        helpDesk.processPrinterEnquiries();
        helpDesk.processGeneralEnquiries();
        helpDesk.processPrinterEnquiries();

    }
}
