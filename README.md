#Months Switch
This program prompts the user to enter the number of days in a month. The program returns all the months that have that amount of days via a switch statement.


IPO

INPUT

    number of days

OUTPUT

    JANUARY MARCH MAY JULY AUGUST DECEMBER for 31 days
    
    FEBRUARY for 28 days
    
    APRIL JUNE SEPTEMBER OCTOBER NOVEMBER for 30 days
    
    "No months have exactly <userValue> days
    

PROCESS

BEGIN
    
    prompt user for number of days in the month
    get daysInMonth

    if daysInMonth = 31
        display JAN MAR MAY JUL AUG DEC

    if daysInMonth = 28
        display FEB
    
    if daysInMonth = 30
        display APR JUN SEP OCT NOV
    
    else 
        display "No months have exactly <userValue> days"

END


