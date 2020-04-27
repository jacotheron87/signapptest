# signapptest

### Deploy instructions 
- Clone or Download and unzip this repo
- Do a maven: clean install
- Execute: java -jar target/signapptest-0.0.1-SNAPSHOT.jar

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
