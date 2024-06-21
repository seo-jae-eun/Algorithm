-- 코드를 작성해주세요
SELECT ED.ID, IFNULL(C.CHILD_COUNT, 0) AS CHILD_COUNT FROM ECOLI_DATA AS ED 
LEFT JOIN (SELECT PARENT_ID, COUNT(ID) AS CHILD_COUNT FROM ECOLI_DATA GROUP BY PARENT_ID HAVING PARENT_ID IS NOT NULL) AS C
ON ED.ID = C.PARENT_ID
ORDER BY ID;

# SELECT * FROM ECOLI_DATA WHERE PARENT_ID IS NULL;

# SELECT PARENT_ID, COUNT(ID) FROM ECOLI_DATA GROUP BY PARENT_ID HAVING PARENT_ID IS NOT NULL;

# SELECT * FROM ECOLI_DATA WHERE PARENT_ID IS NULL;