-- 코드를 입력하세요
SELECT DISTINCT(CRCRH.CAR_ID) FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS CRCRH
LEFT JOIN CAR_RENTAL_COMPANY_CAR AS CRCC
ON CRCRH.CAR_ID = CRCC.CAR_ID
WHERE CRCRH.START_DATE LIKE ('2022-10-%')
AND CAR_TYPE = '세단'
ORDER BY CRCRH.CAR_ID DESC;