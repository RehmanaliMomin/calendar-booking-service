# calendar-booking-service
A Calendar Slot Booking service, which allows people to define their available slots on a day and other people to book them.

We'll define 2 persons : 
1. Creator/Definer who can define slots.
2. User who can book those available slots, after getting the link from the creator/definer.

Assumptions :
1. Creator can define 1 hour slots of the form 1:00 to 2:00.
2. User can book 1 slot at a time form the creator/definer.
3. We will ask user for email id and phone details, in order to book the creator's slot.


APIs:
1. Signup
2. Login
3. Define Slots (Authentication required)
4. Get Slots of a definer.
5. Book Slots

Creator will be authenticated while he is defining the slots.
There's no authentication for getting those available slots and booking them.

Further things that can be done :
1. Test cases.
2. Integration with Google Calendar.
3. More checks and different response for different cases instead of generic one.
4. Error and Exception handling.

Postman Collection link - https://www.postman.com/collections/e20f427702ff81553ace
Use this link to import in your postman.

Published version - https://documenter.getpostman.com/view/5476575/SzYdUcMh?version=latest
Postman Link :
