Feature: Passing the datas with header

  Scenario: Header with single values
    Given user sending the data with header
      | username | cucumber |
      | password |    12345 |

  Scenario: Header with multiple values
    Given user sending datas with header
      | id | name  | password | email          | mobile no |
      |  1 | user1 |      123 | user1@gmail.com |   1346789 |
      |  2 | user2 |      245 | user2@gmail.com |   3346789 |
      |  3 | user3 |      566 | user3@gmail.com |   6346789 |
