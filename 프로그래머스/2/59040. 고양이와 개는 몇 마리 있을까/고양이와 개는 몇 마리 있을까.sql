-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(*) AS count FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE;

# select * from animal_ins;