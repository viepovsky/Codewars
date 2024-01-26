CREATE TABLE dishes AS
SELECT id AS restaurant_id,
       UNNEST(STRING_TO_ARRAY(menu, ',')) AS dish
FROM restaurants;

ALTER TABLE restaurants
DROP COLUMN menu;
