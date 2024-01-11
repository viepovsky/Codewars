SELECT SUBSTRING(project, 0, commits + 1) AS project,
       SUBSTRING(address, LENGTH(address) - contributors + 1) AS address
FROM repositories;

SELECT LEFT(project, commits) AS project,
       RIGHT(address, contributors) AS address
FROM repositories;