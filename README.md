# spring-jpa
This is a simple application showing how to use Spring Data JPA.
# setup
- Install MySql
  sudo apt install mysql-server 
- Install MySql-workbench
  sudo apt-get install mysql-workbench
- Create a user in mysql
   mysql> create database db_example; -- Create the new database
   mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
   mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all the privileges to the new user on the newly created database
   
#Testing
The server is running on port 8010. Feel free change the port in application.yml
Add weather information :
http://localhost:8010/rest/add?location=Pickering&country=Canada&degree=12
Retrieve weather information :
http://localhost:8010/rest/info
