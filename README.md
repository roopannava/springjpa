# springjpa

# setup
- Install MySql
  sudo apt install mysql-server 
- Install MySql-workbench
  sudo apt-get install mysql-workbench
- Create a user in mysql
   mysql> create database db_example; -- Create the new database
   mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
   mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all the privileges to the new user on the newly created database