CREATE FUNCTION increment(value INT)
    RETURNS INT
BEGIN
    RETURN value + 1;
END;

SELECT increment(age);