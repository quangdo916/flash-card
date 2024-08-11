# Testing Guidelines

## Controller Tests

**Purpose:** Verify REST API endpoints' functionality, including responses, status codes, and error handling.

- **Endpoint Availability:**
  - **GET Requests:** Ensure endpoints return expected HTTP status codes (e.g., 200 OK) and correct response bodies.
  - **POST Requests:** Verify creation of new resources and accurate response data.
  - **PUT Requests:** Check for correct updates to existing resources and accurate responses.
  - **DELETE Requests:** Ensure resources are deleted successfully with the correct response.

- **Validation:**
  - **Input Validation:** Handle invalid inputs and return appropriate error messages (e.g., 400 Bad Request).

- **Authentication and Authorization:**
  - **Access Control:** Test endpoints with different user roles and verify access control.
  - **Security:** Confirm endpoints require authentication where necessary.

- **Exception Handling:**
  - **Error Scenarios:** Validate proper exception handling and meaningful error responses (e.g., 404 Not Found).

- **Integration with Other Components:**
  - **Service Layer:** Ensure proper interaction with the service layer.

## Service Tests

**Purpose:** Verify business logic correctness and service operations.

- **Business Logic:**
  - **Correctness:** Ensure business logic behaves as expected.
  - **Edge Cases:** Test service handling of edge cases or unusual inputs.

- **Interactions with Other Components:**
  - **Repository Layer:** Use mocks to isolate service logic and verify interactions with repositories.
  - **External Services:** Mock external APIs or services to test proper handling.

- **Error Handling:**
  - **Exceptions:** Ensure service handles exceptions appropriately.

- **Transactional Behavior:**
  - **Transactions:** Verify correct transaction management (commit or rollback).

## Repository Tests

**Purpose:** Verify the repository layer's interaction with the database and CRUD operations.

- **CRUD Operations:**
  - **Create:** Test if new entities are correctly saved.
  - **Read:** Ensure correct retrieval of entities based on various criteria.
  - **Update:** Verify updates to existing entities.
  - **Delete:** Test entity deletion.

- **Query Methods:**
  - **Custom Queries:** Ensure custom query methods return correct results.

- **Data Integrity:**
  - **Consistency:** Confirm data consistency and adherence to constraints.

## Configuration Tests

**Purpose:** Ensure that the application's configuration settings are correctly applied and functioning as expected.

- **General Configuration:**
  - **Database Configuration:** Verify that the application correctly loads PostgreSQL connection settings, such as JDBC URL, username, and password. Confirm that JPA settings, including Hibernate properties, are correctly applied.
  - **JPA Settings:** Test that Hibernate settings such as `ddl-auto` and SQL logging are configured as specified in the properties file.

- **CORS Configuration:**
  - **Allowed Origins:** Ensure that CORS settings permit requests from the specified origins. Verify that the allowed methods and headers are correctly configured.
  - **Configuration Validation:** Confirm that CORS policy is correctly applied and restricts or allows access based on the configuration.

- **Security Configuration:**
  - **Access Control:** Verify that security rules are enforced for various endpoints, ensuring proper authentication and authorization mechanisms are in place.
  - **Endpoint Protection:** Ensure that endpoints are secured as intended and that unauthorized access is properly restricted.


