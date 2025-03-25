# Bean scope in spring boot

## Singleton scope : 

  __default scope in spring boot__
    - single instance will be created and shared across the spring container
	- Best for state less Bean
	
	``` 
	@Component
	@Scope("singleton")  // Optional (default behavior)
	public class SingletonBean 
	{
	      public SingletonBean() 
	      {
	        System.out.println("SingletonBean instance created");
	      }
     }
    ```
   Behavior:
   Only one instance is created for the entire application.  
   Any dependency injection will reuse the same instance
   

##2) Prototype scope

   A new bean instance is created every time it is requested.
   Useful for stateful beans where each request needs its own object.
    
    ```
    @Component
    @Scope("prototype")
    public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("PrototypeBean instance created");
    }
    }
    ```
    
  Behavior: Each @Autowired injection or context.getBean() call creates a new instance.
  
## 3) Request scope  (For Web Applications)

   A new instance is created for each HTTP request.
   Used in Spring MVC controllers to handle user requests independently.
    ```
    
	    @Component
	    @Scope(value = WebApplicationContext.SCOPE_REQUEST)
		    public class RequestBean 
		    {
		    public RequestBean() 
		    {
		        System.out.println("RequestBean instance created");
		    }
	    }
    ```
    
  Behavior: Every HTTP request gets a new instance of the bean.

## 4) Session scope (session) (For Web Applications)
   A new instance is created for each HTTP session.
   The bean is shared across multiple requests from the same user session.
	
	```
	@Component
      @Scope(value = WebApplicationContext.SCOPE_SESSION)
	    public class SessionBean 
	    {
	    public SessionBean() {
	        System.out.println("SessionBean instance created");
	    }
          }
	```
	
   Behavior:
   The bean is created once per user session and reused across multiple requests.
	
## 5) Application scope (application)

   A single instance is created per ServletContext (shared across all sessions).
   Used when you need to store global state for all users.
   
	   ```
	   @Component
	   @Scope(value = WebApplicationContext.SCOPE_APPLICATION)
	   public class ApplicationBean 
	   {
	          public ApplicationBean() 
		    {
		        System.out.println("ApplicationBean instance created");
		    }
	    }
	     ```
	     
   Behavior: Only one instance exists in the application lifecycle.
    
## 6) web-socket scope (websocket) (For WebSocket Connections)

   A new instance is created for each WebSocket session.
   Available since Spring 4.3.
   
	   ```
	   @Component
	   @Scope(value = WebApplicationContext.SCOPE_WEBSOCKET)
	   public class WebSocketBean {
	    public WebSocketBean() {
	        System.out.println("WebSocketBean instance created");
	    }
	    }
	   
	   ```
   
   Use singleton for stateless beans (e.g., services, DAOs).
   Use prototype for stateful beans (e.g., user preferences).
   Use request for request-specific data in web applications.
   Use session for session-specific data (e.g., shopping cart).
   Use application for globally shared beans (e.g., caches).
   