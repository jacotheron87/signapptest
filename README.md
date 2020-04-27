# signapptest

### CMD deploy instructions 
- Download and unzip this repo
- From a new command prompt window, navigate to the target folder of the project
- Execute: java -jar signapptest-0.0.1-SNAPSHOT.jar

### Question 1
After startup 2 threads will print to the window

### Question 2

- Endpoint: http://localhost:8080/v1/patients
- Method: POST

#### Sample Request
```
{
	"stream_name":"Joe Teapot",
	"client_id":"838|7563AB",
	"users":[
	{
		"name":"Not Joe",
		"is_admin": true
	},
	{
		"name":"Joe",
		"is_admin": false
	}
	]
}
```

#### Sample Response
```
{
    "stream_name": "Joe Teapot",
    "client_id": "7563AB",
    "users": [
        {
            "name": "Not Joe",
            "is_admin": true
        },
        {
            "name": "Joe",
            "is_admin": false
        }
    ]
}
```