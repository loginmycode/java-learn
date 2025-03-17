link(https://www.geeksforgeeks.org/json-web-token-jwt/)

JWT - JSON WEB TOKEN  
		* JSON web token is used for secure way to authenticate users
		* Validate identities
		* provides safe communication between client and servers
		* Prevents unauthorized access 
		* This information can be trusted because its DIGITALLY SIGNED
    -     JWT Can be signed using these two ways
		   1) HMAC (Hash-based Message Authentication Code)
		   2) RSA  (Asymmetric cryptographic algorithms
	   
   - How JWT WORKS
   * USER LOGS IN : Client(browser) sends a login credentials to server
   * Server generates JWT : If credentials are are valid 
	     It Contains User data
	     It contains Secret key
   * Token sent to client : The JWT is sent back to the client and stored (usually 	       	 in localStorage or a cookie).
   * Client Sends Token in Requests: For protected routes, the client includes the    	 	 		JWT in the Authorization header (Bearer Token).
   * Server Verifies and Responds: The server verifies the token, extracts user 	 	 	 		info, and processes the request if valid.
    
	  
   JWT Structure
	    A JWT consists of three parts, separated by dots (.)
	    (Header. Payload. Signature)
	    Header: Contains metadata about the token, such as the algorithm used for signing.
	            Contains metadata about the token.
	            -
		Payload: Stores the claims, i.e., data being transmitted.
				{
				    "userId": 123,
				    "role": "admin",
				    "exp": 1672531199
				}
			     Registered claims (e.g., iss - issuer, exp - expiration time, sub -  				 				 subject).
			     -
		Signature: Ensures the token’s integrity and authenticity.
		
	
	
   