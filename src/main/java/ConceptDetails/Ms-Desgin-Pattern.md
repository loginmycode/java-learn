# API- Gateway Pattern

  - Single entity point to all clients
  - Routing request to appropriate M-S
  - It can handle cross cutting
  - such as Authentication, Logging, rate limiting and load balance
   
            A large e-commerce platform where multiple clients (web, mobile, third-party) need to
       	 interact with various services (catalog, user management, orders). The API Gateway
       	 simplifies client communication by providing a unified interface and handling
       	 complexities 	like security and routing.
       	 
# Database per service Pattern

  - Each  __Microservice__  has its own  **Database**
  - Ensuring loose coupling and idependent data management
  
  
    	   SaaS application with multiple microservices such as billing, user management, and  
    	   analytics. Each service requires different database technologies (e.g., relational
    	   for billing, NoSQL for user profiles, time-series for analytics), allowing
    	   optimized performance and scalability.
    	   
# Circuit Breaker Pattern 

  - This service prevents service failure
  - It provide fallback mechanism if service is unreachable or fails
  - It call the service and breaks the circuit to further calls
	  
	  	A travel booking system where multiple external services (airline,
	  	hotel, car rental) are integrated.
	  	If one service is slow or  fails, the circuit breaker prevents cascading failures and
	  	provides a default response to maintain system stability.
	  	
# Service Recovery Pattern

  - Service Discovery allows to find microservice and communicate  dynamically
  
      A microservices-based application deployed in a cloud environment where instances of services start and stop frequently. Service discovery ensures that services can locate each other without manual configuration, enabling automatic scaling and resilience.
 
# Event Sourcing pattern
 
   - Instead of storing just the current state,
   - It stores the state changes (events),  
   - Allowing the system to reconstruct past states and audit trails.
   
    A financial application managing transactions and accounts. By using event sourcing, the system can reconstruct account histories, track every transaction, and provide audit trails for regulatory compliance.

# CQRS - Command Query Responsibility segregation
  - It Separates the read and write operation of data store
  - Command update the state (Write Operation)
  - Query Fetch data from different model optimized for reads (Read Operation)
  
    An online retail application where the product catalog requires frequent updates and fast queries. Using CQRS, the write model ensures consistency when updating product information, while the read model provides quick responses for customer queries.'
  
# SAGA Pattrn  (System for Automated Geoscientific Analyses)
  - Saga manages distributed transactions across multiple microservices by coordinating a sequence of local transactions.
  
    An order processing system where placing an order involves multiple services (payment, inventory, shipping). The saga pattern ensures that all steps are completed successfully, and if any step fails, compensating actions roll back the previous steps.
  
  
 