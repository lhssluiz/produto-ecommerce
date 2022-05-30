#Informações úteis do projeto
### Projeto meramente educativo 

## Informações Docker
- **ecommerce-network**: 38d3e37d46c8b138e86042230350d2a4aace1af76257d72d228394ee503b9c70
- **container**: produtos-mysql
  - id: 6cde954a9ca7
  - image: mysql:latest
  - porta: 3306
  - PASSWORD: mercadolivre
  - DATABASE: produtos
- **container**: produtos-mysql-main
  - id: 00914e50e8b1 
  - image: produtos-mysql-app
  - porta: 8080