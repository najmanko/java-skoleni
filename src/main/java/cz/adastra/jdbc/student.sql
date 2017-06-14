CREATE TABLE STUDENT (
         ID           NUMBER(5) PRIMARY KEY,
         NAME         VARCHAR2(15) NOT NULL,
         SURNAME      VARCHAR2(20) NOT NULL,
         AGE          NUMBER(3)
         );

INSERT INTO STUDENT VALUES (1, 'Jan', 'Nepomuk', 387);
INSERT INTO STUDENT VALUES (2, 'Jara', 'Cimrman', 100);
INSERT INTO STUDENT VALUES (1, 'Milos ', 'Zeman', 70);
INSERT INTO STUDENT VALUES (1, 'Petr', 'Maly', 5);