# Test REST Easy
Simple test for the Firefox plugins REST Easy showcasing a bug introduced in 0.3.1

- in 0.3.1 sometimes the plugins act as if the server didn't returned an answer. 
This simple test reproduce this behavior. 

- It seems that the issue happens when the Content-Type isn't properly set.
- Uncommenting line 53 of servlet.java seems to fix the issue: 
	```java
	//http_response.setContentType("text/html");
	```