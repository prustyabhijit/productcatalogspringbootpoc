# productcatalogspringbootpoc

ADD Product
http://localhost:9393/product/add/ 

payload
{
"productName": "Samasung Galaxy 10",
"type": "Mobile",
"listPrice": 481.83,
"productCode": "P22"
}

find by id
http://localhost:9393/product/find/{id}

http://localhost:9393/product/find/601/

delete
http://localhost:9393/product/delete/{id}/

http://localhost:9393/product/delete/601/

list all
http://localhost:9393/product/list/

Health check - 

http://localhost:9393/product/actuator/health
