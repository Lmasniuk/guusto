guusto
# Guusto Merchant Explorer

## Overview
This is a simple web app that is intended to allow a user to be able to explore the merchants that Guusto offers gift cards for. 

## Getting Started

### Requirements
*  [JDK 1.8](https://www.oracle.com/java/technologies/downloads/)
*  [Maven 3.2+](https://maven.apache.org/download.cgi)

### Clone the Repository
Clone the repository by running the following command:
```
git clone git@github.com:Lmasniuk/guusto.git
```

### Build the Application
Start the application by running the following command:
```
./mvnw package 
```

### Build & Run the Docker Image
```
docker build -t guusto-merchant-explorer .
docker run -p 8080:8080 guusto-merchant-explorer
```

### View the Application
Navigate to http://localhost:8080


## Notes
* This project was initialized with the [Spring Initializer](https://start.spring.io/)