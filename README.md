
# Managing Assistants Backend

This repository contains the backend code for the Managing Assistants application. It includes the Spring Boot application code, database models, and Postman API collection.


## Getting Started
To run the backend application locally, follow these steps:

Clone the project

```bash
 git clone https://github.com/imabhosale/Managing-assistants-backend.git

```

Go to the project directory

```bash
 cd Managing-assistants-backend
```
Run the Application:
```bash
  mvn spring-boot:run
```
This will start the Spring Boot application locally on port 7517 as we defined server.port=7517.

## Postman API Collection

The PostmanAPIs folder contains the Postman collection for testing the backend APIs. Import this collection into Postman to explore and test the available endpoints.

### Import Instructions: 

1) Open Postman.
2) Click on the Import button.
3) Select the PostmanAPIs folder from the repository.
4) The collection will be imported into Postman.

## API Endpoints
The backend application provides the following API endpoints:

1) POST /assistants: Create a new assistant record.
2) GET /assistants/{assistant_id}: Retrieve details of a specific assistant.
3) PUT /assistants/{assistant_id}: Update details of a specific assistant.
4) DELETE /assistants/{assistant_id}: Delete a specific assistant record.
5) GET /assistants: Retrieve details of all assistants.