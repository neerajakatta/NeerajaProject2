Feature: This feature file is designed to validate Home page functionalities in below listed scenarios
@Regressiontest
Scenario: This scenario is designed to validate all the display conditions
    Given As an user i want to launch firefox browser
    When an application is opened verify home page is displayed
    Then Enter "Username" and "Password"
    |admin|admin|  
    Then add new staff details with all manadatory fields  
 		|Neer1|F|01-01-1900|unmarried|revenue|01-01-1979|Hyd|9898989898|abqcd@gmail.com|pass1|
 		|Neeraj2|M|01-01-1901|married|developer|01-01-1980|Bang|1234567891|abcqd1@gmail.com|pass2|
 		|Neer3|F|01-01-1902|unmarried|revenue|01-01-1981|Kolkatta|9898989899|abcqd2@gmail.com|pass3|
 		|Neeraja4|M|01-01-1903|divorced|developer|01-01-1982|Delhi|9898989888|abdqc3@gmail.com|pass4|
 		|Neer5|F|01-01-1904|unmarried|revenue|01-01-1983|Amaravati|9898989897|abcqd4@gmail.com|pass5|
